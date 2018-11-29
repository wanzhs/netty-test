package zc.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 *   服务器应答充电桩充电上报最新一次充电信息报文
 * @author 63136
 *
 */
@Data
@Accessors(chain = true)
public class ParamTableCMD201 
{
 
	/**
	 * 充电枪号
	 */
	private Integer gunid;
	/**
	 * 状态--“true”：成功“false”：失败
	 */
	private String state;
	/**
	 * 原因--成功：“success”流水单号不存在：“noExitesTransactionId”用户不存在：“noExitesUser”数据有误：“recordFault”
	 */
    private String reason;
	 
	 
	 
	
}
