package zc.core;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 报文格式辅助类
 */
@Data
@Accessors(chain = true)
public class ProtocolBean {
    //数据头 2字节  0xAAF5
    private final short header = (short) 0xAAF5;
    //数据长度 2字节
    private short length;
    //分割 2字节
    private short segmentation = (short) 0xA55A;
    //数据 json格式 N个字节
    private String content;
    //校验 数据累加和 1字节
    private byte check;
    //数据尾  2字节  0xF5AA
    private final short footer = (short) 0xF5AA;


    public ProtocolBean(int length, String content) {
        this.length = (short) length;
        this.content = content;
        this.check = this.sumCheck(content.getBytes());
    }

    /**
     * @author:wanzhongsu
     * @description: 数据累加和校验
     * @date:2018/11/29 17:06
     */
    private byte sumCheck(byte[] msg) {
        int mSum = 0;
        for (byte byteMsg : msg) {
            int nNum = (int) byteMsg >= 0 ? (int) byteMsg : ((int) byteMsg + 256);
            mSum += nNum;
        }
        byte check = (byte) (mSum % 256);
        return check;
    }

    @Override
    public String toString() {
        return "ProtocolBean{" +
                "header=0x" + String.format("%X", header) +
                ", length=" + length +
                ", segmentation=0x" + String.format("%X", segmentation) +
                ", content='" + content + '\'' +
                ", check=" + check +
                ", footer=0x" + String.format("%X", footer) +
                '}';
    }
}
