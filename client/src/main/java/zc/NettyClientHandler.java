package zc;

import com.ga.zc.core.MyProtocolBean;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * Created by yaozb on 15-4-11.
 */
public class NettyClientHandler extends SimpleChannelInboundHandler<MyProtocolBean> {

    protected void messageReceived(ChannelHandlerContext ctx, MyProtocolBean msg) throws Exception {
//        ctx.writeAndFlush(new MyProtocolBean((byte) 0xA,(byte)0xC,"Hello,Netty".length(),"Hello,Netty"));

    }
}
