package zc;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.Attribute;
import io.netty.util.AttributeKey;
import zc.core.ProtocolBean;
import zc.params.User;

/**
 * Created by yaozb on 15-4-11.
 */
public class NettyClientHandler extends SimpleChannelInboundHandler<ProtocolBean> {

    protected void messageReceived(ChannelHandlerContext ctx, ProtocolBean msg) throws Exception {
//        ctx.writeAndFlush(new ProtocolBean((byte) 0xA,(byte)0xC,"Hello,Netty".length(),"Hello,Netty"));

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        super.channelActive(ctx);
        Attribute<String> attribute;

    }
}
