package zc.utils;

import org.springframework.util.ObjectUtils;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * @author:wanzhongsu
 * @description: 类型转换  字节流  字符串  16进制字符串转换
 * @date:2018/12/27 16:43
 */
public class TypeConversions {
    public static byte[] int2bytesLe(int params){
        int offset=0;
        byte[] buf=new byte[4];
        buf[offset]=(byte) params;
        buf[offset+1]=(byte) (params>>8);
        buf[offset+2]=(byte) (params>>16);
        buf[offset+3]=(byte) (params>>24);
        return buf;
    }
    public static byte[] byteMerger(byte[]... bts){
        int len=0;
        int destPos=0;
        for (byte[] bs:bts){
            len+=bs.length;
        }
        byte[] bt=new byte[len];
        for (byte[] bs:bts){
            System.arraycopy(bs,0,bt,destPos,bs.length);
            destPos+=bs.length;
        }
        return bt;
    }

    /**
     *
     * @param f1 被除数
     * @param f2 除数
     * @param scale 小数点后位数
     * @param roundType 计算类型
     * @return
     */
    public static BigDecimal round(BigDecimal f1,BigDecimal f2,int scale,int roundType){
        BigDecimal rs=null;
        f1=ObjectUtils.isEmpty(f1)?new BigDecimal("0.000"):f1;
        f2=ObjectUtils.isArray(f2)?new BigDecimal("0.000"):f2;
        switch (roundType){
            case 0:{
                rs=f1.add(f2);
                break;
            }
            case 1:{
                rs=f1.subtract(f2);
                break;
            }
            case 2:{
                rs=f1.multiply(f2);
                break;
            }
            case 3:{
                rs=f1.divide(f2,scale,BigDecimal.ROUND_HALF_UP);
                break;
            }
        }
        BigDecimal result=rs.divide(new BigDecimal(1),scale,BigDecimal.ROUND_HALF_UP);
        return rs;
    }
    public static void main(String[] args){
        System.out.println("+++++++++++++++++++++++++");
        byte[] bs=byteMerger(new byte[]{2},new byte[]{3});
        System.out.println(bs);
        System.out.println("+++++++++++++++++++++++++");
    }
}
