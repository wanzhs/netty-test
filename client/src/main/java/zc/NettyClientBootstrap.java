package zc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.serialization.ClassResolvers;
import io.netty.handler.codec.serialization.ObjectDecoder;
import io.netty.handler.timeout.IdleStateHandler;
import io.netty.util.concurrent.DefaultEventExecutorGroup;
import io.netty.util.concurrent.EventExecutorGroup;
import zc.core.MsgTransfer;
import zc.core.MyProtocolBean;
import zc.core.MyProtocolEncoder;
import zc.params.ParamTableCMD1;
import zc.params.User;

import java.util.concurrent.TimeUnit;

/**
 * Created by yaozb on 15-4-11.
 */
public class NettyClientBootstrap {
    private int port;
    private String host;
    private SocketChannel socketChannel;
    private static final EventExecutorGroup group = new DefaultEventExecutorGroup(20);
    public NettyClientBootstrap(int port, String host) throws InterruptedException {
        this.port = port;
        this.host = host;
        start();
    }
    private void start() throws InterruptedException {
        EventLoopGroup eventLoopGroup=new NioEventLoopGroup();
        Bootstrap bootstrap=new Bootstrap();
        bootstrap.channel(NioSocketChannel.class);
        bootstrap.option(ChannelOption.SO_KEEPALIVE,true);
        bootstrap.group(eventLoopGroup);
        bootstrap.remoteAddress(host,port);
        bootstrap.handler(new ChannelInitializer<SocketChannel>() {
            @Override
            protected void initChannel(SocketChannel socketChannel) throws Exception {
                socketChannel.pipeline().addLast(new IdleStateHandler(20,10,0));
//                socketChannel.pipeline().addLast(new ObjectEncoder());
                socketChannel.pipeline().addLast(new MyProtocolEncoder());
                socketChannel.pipeline().addLast(new ObjectDecoder(ClassResolvers.cacheDisabled(null)));
            }
        });
        ChannelFuture future =bootstrap.connect(host,port).sync();
        if (future.isSuccess()) {
            socketChannel = (SocketChannel)future.channel();
            System.out.println("connect server  成功---------");
        }
    }
    public static void main(String[]args) throws InterruptedException, JsonProcessingException {
        NettyClientBootstrap bootstrap=new NettyClientBootstrap(9999,"localhost");
        while (true){
            TimeUnit.SECONDS.sleep(3);
//            bootstrap.socketChannel.writeAndFlush(new MyProtocolBean((byte) 0xA,(byte)0xC,"Hello,Netty".length(),"Hello,Netty"));
            ObjectMapper objectMapper=new ObjectMapper();
            MsgTransfer msgTransfer=new MsgTransfer();
            msgTransfer.setCmd(1).setCmd(1).setSn(123)
                    .setData(objectMapper.writeValueAsString(new User()
                            .setUsername("wanzhs").setPassword("admin123")));
            String jsonstr=objectMapper.writeValueAsString(msgTransfer);

            bootstrap.socketChannel.writeAndFlush(new MyProtocolBean(jsonstr.length(),jsonstr));

            ParamTableCMD1 paramTableCMD1=new ParamTableCMD1();
            paramTableCMD1.setAdminpwd("password").setAdverStartTime("2018-09-11 21:22:22");

            msgTransfer.setCmd(2).setData(objectMapper.writeValueAsString(paramTableCMD1));
            jsonstr=objectMapper.writeValueAsString(msgTransfer);
            bootstrap.socketChannel.writeAndFlush(new MyProtocolBean(jsonstr.length(),jsonstr));

        }
    }
}
