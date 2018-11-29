package zc.utils;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 时间处理工具类
 */
public class DateUtils {

    /**
     * 定义时间格式字符串信息
     */
    public static final String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

    /**
     * 格式化时间格式为:yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static String  getFormatTime(){
        Date now=new Date();
        SimpleDateFormat dateFormat =  new SimpleDateFormat(DateUtils.DATE_TIME_PATTERN);
        return  dateFormat.format(now).toString();
    }

    /**
     * 格式化时间格式为:yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static String getDateTime(Date now){
        SimpleDateFormat dateFormat =  new SimpleDateFormat(DateUtils.DATE_TIME_PATTERN);
        return  dateFormat.format(now).toString();
    }




    /**
     * 时间加减小时
     * @param startDate 要处理的时间，Null则为当前时间
     * @param hours 加减的小时
     * @return Date
     */
    public static Date dateAddHours(Date startDate, int hours) {
        if (startDate == null) {
            startDate = new Date();
        }
        Calendar c = Calendar.getInstance();
        c.setTime(startDate);
        c.set(Calendar.HOUR, c.get(Calendar.HOUR) + hours);
        return c.getTime();
    }

    /**
     * 时间加减分钟
     * @param startDate 要处理的时间，Null则为当前时间
     * @param minutes 加减的分钟
     * @return
     */
    public static Date dateAddMinutes(Date startDate, int minutes) {
        if (startDate == null) {
            startDate = new Date();
        }
        Calendar c = Calendar.getInstance();
        c.setTime(startDate);
        c.set(Calendar.MINUTE, c.get(Calendar.MINUTE) + minutes);
        return c.getTime();
    }

    /**
     * 时间加减秒数
     * @param startDate 要处理的时间，Null则为当前时间
     * @param seconds 加减的秒数
     * @return
     */
    public static Date dateAddSeconds(Date startDate, int seconds) {
        if (startDate == null) {
            startDate = new Date();
        }
        Calendar c = Calendar.getInstance();
        c.setTime(startDate);
        c.set(Calendar.SECOND, c.get(Calendar.SECOND) + seconds);
        return c.getTime();
    }



    public static void main(String[] args) throws Exception {

        System.out.println(getFormatTime());
        Date data=null;
        String strDate="";
        for(int i=1;i<50;i++)
        {
//            //小时
//          data=dateAddHours(new Date(),i);
//          strDate=getDateTime(data);
//          System.out.println(strDate);
            //分钟
//            data=dateAddMinutes(new Date(),i);
//            strDate=getDateTime(data);
//            System.out.println(strDate);
            //秒
            data=dateAddSeconds(new Date(),i);
            strDate=getDateTime(data);
            System.out.println(strDate);

        }
    }


}
