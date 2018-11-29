package zc.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 *   后台服务器对充电桩流水单号请求应答
 * @author 63136
 *
 */
@Data
@Accessors(chain = true)
public class ParamTableCMD9 
{
 
	/**
	 * 充电枪口--同服务发送枪口
	 */
	private Integer gunid;
	/**
	 * 流水单号--服务器定义单号(扫码充电时，二维码的生成字符串)16字节数字非0开头流水单号
	 */
	private String transactionId;
	 
	 
	
}
