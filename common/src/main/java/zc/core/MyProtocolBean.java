package zc.core;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class MyProtocolBean {
    //数据头 2字节  0xAAF5
    private final short header= (short) 0xAAF5;
    //数据长度 2字节
    private short length;
    //分割 2字节
    private short segmentation=(short) 0xA55A;
    //数据 json格式 N个字节
    private String content;
    //校验 数据累加和 1字节
    private byte check;
    //数据尾  2字节  0xF5AA
    private final short footer=(short)0xF5AA;


    public MyProtocolBean(int length, String content) {
        this.length = (short) length;
        this.content = content;
        this.check = this.sumCheck(content.getBytes());
    }
    private byte sumCheck(byte[] msg){
        long mSum=0;
        for (byte byteMsg:msg){
            long nNum=(long)byteMsg>=0?(long)byteMsg:((long)byteMsg+256);
            mSum +=nNum;
        }
        byte check= (byte) ((byte) mSum%256);
        return check;
    }
    @Override
    public String toString() {
        return "MyProtocolBean{" +
                "header=0x" + String.format("%X",header) +
                ", length=" + length +
                ", segmentation=0x" + String.format("%X",segmentation) +
                ", content='" + content + '\'' +
                ", check=" + check +
                ", footer=0x" + String.format("%X",footer)+
                '}';
    }
}
