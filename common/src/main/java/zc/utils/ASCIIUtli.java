package zc.utils;

import java.util.Arrays;

/**
 * Ascii转换工具类
 * @author pcl
 *
 */
public class ASCIIUtli {
	
	/**
	 * 将字符串转成ASCII的java方法
	 * @param value
	 * @return
	 */
	public static String stringToAscii(String value)  
	{  
	    StringBuffer sbu = new StringBuffer();  
	    char[] chars = value.toCharArray();   
	    for (int i = 0; i < chars.length; i++) {  
	        if(i != chars.length - 1)  
	        {  
	            sbu.append((int)chars[i]).append(",");  
	        }  
	        else {  
	            sbu.append((int)chars[i]);  
	        }  
	    }  
	    return sbu.toString();  
	}
	/**
	 * 将ASCII转成字符串的java方法
	 * @param value
	 * @return
	 */
	public static String asciiToString(String value)  
	{  
	    StringBuffer sbu = new StringBuffer();  
	    String[] chars = value.split(",");  
	    for (int i = 0; i < chars.length; i++) {  
	        sbu.append((char) Integer.parseInt(chars[i]));  
	    }  
	    return sbu.toString();  
	}
	
	 
	

	public static void main(String[] args) {
		 
//		 String str = "你在哪里干什么呢";
		 String string="20320,22312,21738,37324,24178,20160,20040,21602";
//         String asciiResult = stringToAscii(str);
//         System.out.println(asciiResult);
         String stringResult = asciiToString(string);
         System.out.println(stringResult);
         System.out.println(Arrays.toString("你".getBytes()));

	}

}
