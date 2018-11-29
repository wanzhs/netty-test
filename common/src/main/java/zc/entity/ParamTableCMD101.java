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
public class ParamTableCMD101 
{
 
	/**
	 * 心跳应答--CMD=102心跳序号 注意：心跳应该必须跟CMD=102桩发的一致
	 */
	private Integer hbAck;
	 
	 
	 
	
}
