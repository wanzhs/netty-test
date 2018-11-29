package zc.utils;


import java.util.UUID;

/**
 * 生成报文流水号
 */
public class SystemNum {

    /**
     * 生成编号信息
     * @return
     */
    public static Long getSystem()
    {

        Long dateTimeNum=System.currentTimeMillis();

        return dateTimeNum;
    }

    /**
     * 生成32位UUID信息编号
     * @return
     */
    public static String getUUID32()
    {
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        return uuid;
    }

    public static void main(String[] args) {
        System.out.println(getSystem());
        System.out.println(getUUID32());
    }
}
