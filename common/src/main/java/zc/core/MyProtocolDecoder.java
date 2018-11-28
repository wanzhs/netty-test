package zc.core;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;

import java.nio.ByteOrder;

public class MyProtocolDecoder extends LengthFieldBasedFrameDecoder {
    private static final int HEADER_SIZE = 2;
    private static final int MAXFRAMELENGTH = 1024 * 1024;
    private static final int LENGTHFIELDOFFSET = 2;
    private static final int LENGTHFIELDLENGTH = 2;
    private static final int LENGTHADJUSTMENT = 5;//该字段值 + 长度字值 = 长度字段后一共的字节数
    private static final int INITIALBYTESTOSTRIP = 0;
    private static final boolean FAILFAST = false;

    /**
     * @param maxFrameLength      帧的最大长度
     * @param lengthFieldOffset   length字段偏移的地址
     * @param lengthFieldLength   length字段所占的字节长度
     * @param lengthAdjustment    修改帧数据长度字段中定义的值，可以为负数
     * @param initialBytesToStrip 解析时跳过多少个长度
     * @param failFast            当frame长度超过maxframelength时，是否立即报tooLongFrameException
     */
    public MyProtocolDecoder(int maxFrameLength, int lengthFieldOffset, int lengthFieldLength, int lengthAdjustment, int initialBytesToStrip, boolean failFast) {
        super(maxFrameLength, lengthFieldOffset, lengthFieldLength, lengthAdjustment, initialBytesToStrip, failFast);
    }

    public MyProtocolDecoder() {
        super(MAXFRAMELENGTH, LENGTHFIELDOFFSET, LENGTHFIELDLENGTH, LENGTHADJUSTMENT, INITIALBYTESTOSTRIP, FAILFAST);
    }

    @Override
    protected Object decode(ChannelHandlerContext ctx, ByteBuf in) throws Exception {
        in = (ByteBuf) super.decode(ctx, in);
        in.order(ByteOrder.LITTLE_ENDIAN);
        if (in == null) {
            return null;
        }
        if (in.readableBytes() < HEADER_SIZE) {
            throw new Exception("字节数不足");
        }
        System.out.println("接收长度为："+in.readableBytes());
        //读取数据头字段
        short header = in.readShort();
        //读取数据长度字段
        short length = in.readShort();
//        if (in.readableBytes() != length) {
//            throw new Exception("标记的长度不符合实际长度"+":标记长度"+length+":实际长度:"+in.readableBytes());
//        }
        //读取分割字段
        short segmentation = in.readShort();
        //读取数据字段
        byte[] content = new byte[length];
        in.readBytes(content);
//        //读取校验字段
        byte check = in.readByte();
//        //读取数据尾字段
        short footer = in.readShort();
        MyProtocolBean bean = new MyProtocolBean(length, new String(content));
        System.out.println("MyProtocolDecoder:"+bean.toString());
//        bean.setCheck(check).setSegmentation(segmentation);
        return bean;
    }
}
