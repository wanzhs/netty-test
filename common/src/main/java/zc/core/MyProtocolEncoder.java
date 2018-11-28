package zc.core;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

import java.nio.ByteOrder;
import java.nio.charset.Charset;

public class MyProtocolEncoder extends MessageToByteEncoder<MyProtocolBean> {
    @Override
    protected void encode(ChannelHandlerContext ctx, MyProtocolBean msg, ByteBuf out) throws Exception{
        if (msg==null){
            throw new Exception("msg is null");
        }
        out.order(ByteOrder.LITTLE_ENDIAN);
        out.writeShort(msg.getHeader());
        out.writeShort(msg.getLength());
        out.writeShort(msg.getSegmentation());
        out.writeBytes(msg.getContent().getBytes(Charset.forName("utf-8")));
        out.writeByte(msg.getCheck());
        out.writeShort(msg.getFooter());
        System.out.println("发送长度为："+out.readableBytes());
    }
}
