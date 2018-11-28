package zc.entity;

 

/**
 *  服务器应答充电桩未上传历史充电记录
 * @author 63136
 *
 */
public class ParamTableCMD401 
{
 
	 
	/**
	 * 充电记录索引
	 */
	private Integer recordIndex;
	/**
	 * 状态--“true”，“false”
	 */
	private String state;
	/**
	 * 原因
	 * 成功：“success  流水单号不存在：“noExitesTransactionId”用户不存在：“noExitesUser”数据有误：“recordFault”
	 */
	private String reason;
}
