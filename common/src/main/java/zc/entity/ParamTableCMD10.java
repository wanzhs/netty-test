package zc.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 *   充电桩向后台服务器申请流水单号
 * @author 63136
 *
 */
@Data
@Accessors(chain = true)
public class ParamTableCMD10 
{
 
	/**
	 * 充电桩编码--ASCII编码
	 */
	private String machineID;
	/**
	 * 充电枪口--同服务发送枪口
	 */
	private Integer gunid;
	/**
	 * 类型--0x00 申请流水单号
	 */
	private Integer type;
	 
	 
	
}
