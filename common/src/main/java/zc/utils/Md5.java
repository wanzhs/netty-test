package zc.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 生成对应MD5方法辅助调用类
 * @author 63136
 *
 */
public class Md5 {
	
	
	private static String strKey="0,1,8,9,16,17,24,25";
	/**
                   * 生成32位md5码
     * @param key
     * @return
     */
    public static String md5(String key) {

        try {
            // 得到一个信息
            MessageDigest digest = MessageDigest.getInstance("md5");
            byte[] result = digest.digest(key.getBytes());
            StringBuffer buffer = new StringBuffer();
            // 把每一个byte 做一个与运算 0xff;
            for (byte b : result) {
                // 与运算
                int number = b & 0xff;
                String str = Integer.toHexString(number);
                if (str.length() == 1) 
                {
                    buffer.append("0");
                }
                buffer.append(str);
            }

            // 标准的md5加密后的结果
            return buffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }

    }
    /**
                  * 生成对应校验码
     * @param paramMd5  生成md5后数据
     * @return
     */
    public static String check(String paramMd5) 
    {
        String md5=md5(paramMd5);
    	StringBuffer buffer=new StringBuffer();
    	
    	String strIndex="";
    	for(int i=0;i<md5.length();i++)
		{
			String temp[]=strKey.split(",");
			for(int j=0;j<temp.length;j++) 
			{
				if(i==j) 
				{
				    Integer index=Integer.parseInt(temp[j]);
				    strIndex=md5.substring(index,index+1);
					buffer.append(strIndex);
				}
				
			}
		}
		return buffer.toString();
    	
    }
    
    
 

	public static void main(String[] args) {
		String keyMd5=md5("你在干嘛呢");
		String strCheck=check(keyMd5);
		System.out.println("校验码:"+strCheck);
		
		
		
	}
	
	 

}
