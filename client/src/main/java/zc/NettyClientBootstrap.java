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
import zc.core.MyProtocolEncoder;
import zc.core.ProtocolBean;
import zc.core.TCPData;
import zc.entity.ParamTableCMD1;
import zc.utils.JsonUtils;
import zc.utils.SystemNum;

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
        EventLoopGroup eventLoopGroup = new NioEventLoopGroup();
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.channel(NioSocketChannel.class);
        bootstrap.option(ChannelOption.SO_KEEPALIVE, true);
        bootstrap.group(eventLoopGroup);
        bootstrap.remoteAddress(host, port);
        bootstrap.handler(new ChannelInitializer<SocketChannel>() {
            @Override
            protected void initChannel(SocketChannel socketChannel) throws Exception {
                socketChannel.pipeline().addLast(new IdleStateHandler(20, 10, 0));
//                socketChannel.pipeline().addLast(new ObjectEncoder());
                socketChannel.pipeline().addLast(new MyProtocolEncoder());
                socketChannel.pipeline().addLast(new ObjectDecoder(ClassResolvers.cacheDisabled(null)));
            }
        });
        ChannelFuture future = bootstrap.connect(host, port).sync();
        if (future.isSuccess()) {
            socketChannel = (SocketChannel) future.channel();
            System.out.println("connect server  成功---------");
        }
    }

    public static void main(String[] args) throws InterruptedException, JsonProcessingException {
        NettyClientBootstrap bootstrap = new NettyClientBootstrap(9999, "localhost");
        while (true) {
            TimeUnit.SECONDS.sleep(3);
            //测试发送协议数据
            //工作参数和命令设置
            ParamTableCMD1 paramTableCMD1 = new ParamTableCMD1();
            paramTableCMD1.setAdminpwd("admin123").setAdverEndTime("1995-09-12 20:20:20");

            //添加到通信报文
            String dataStr=JsonUtils.objectToJsonOrdered(paramTableCMD1);
            TCPData tcpData = new TCPData(1, dataStr);
            String tcpDataStr =JsonUtils.objectToJson(tcpData);

            //添加到发送报文
            ProtocolBean protocolBean=new ProtocolBean(tcpDataStr.length(), tcpDataStr);
            bootstrap.socketChannel.writeAndFlush(protocolBean);
        }
    }
}
