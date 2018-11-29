package zc;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import zc.core.ProtocolBean;

/**
 * Created by yaozb on 15-4-11.
 */
public class NettyClientHandler extends SimpleChannelInboundHandler<ProtocolBean> {

    protected void messageReceived(ChannelHandlerContext ctx, ProtocolBean msg) throws Exception {
//        ctx.writeAndFlush(new ProtocolBean((byte) 0xA,(byte)0xC,"Hello,Netty".length(),"Hello,Netty"));

    }
}
