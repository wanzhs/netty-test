package zc.utils;


import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * 生成报文流水号
 */
public class SystemNum {

    private static int totalCount = 100000000;
    private static int customerID;

    private static int maxNum=900000000;

    /**
     * 生成编号信息
     * @return
     */
    public static Integer getSystem()
    {
        if(customerID==maxNum)
        {
            totalCount=1;
        }
        ++totalCount;
        customerID = totalCount;
        System.out.println("增加一个:"+customerID);

        return  Integer.valueOf(getCustomerID());


        //DateFormat sdf = new SimpleDateFormat("ssSSS");
        //return  Integer.valueOf(sdf.format(new Date())+getRandom(4));
    }

    public static String getCustomerID() {
        DecimalFormat decimalFormat = new DecimalFormat("000000000");
        return decimalFormat.format(customerID);
    }


    /**
     * 生成固定长度随机码
     * @param n    长度
     */
    private static long getRandom(long n) {
        long min = 1,max = 9;
        for (int i = 1; i < n; i++) {
            min *= 10;
            max *= 10;
        }
        long rangeLong = (((long) (new Random().nextDouble() * (max - min)))) + min ;
        return rangeLong;
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

        while(true){

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getSystem());
        }

    }
}
