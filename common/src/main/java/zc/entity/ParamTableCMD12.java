package zc.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 *   充电桩对服务器扫码状态的应答
 * @author 63136
 *
 */
@Data
@Accessors(chain = true)
public class ParamTableCMD12 
{
 
	/**
	 * 充电桩编码--ASCII编码
	 */
	private String machineID;
	/**
	 * 充电枪口--同服务发送枪口
	 */
	private Integer gunid;
	 
	 
	 
	
}
