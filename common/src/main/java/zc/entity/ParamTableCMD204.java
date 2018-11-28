package zc.entity;

/**
 *  充电桩充电上传用户帐户查询报文
 * @author 63136
 *
 */
public class ParamTableCMD204 
{
	/**
	 * 充电桩编码--ASCII编码
	 */
	private String machineID;
	/**
	 * 充电枪号
	 */
	private Integer gunid;
	/**
	 * 用户卡号/用户识别号--ASCII码，不足补’\0’
	 */
	private String cardId;
	 
	/**
	 * 充电卡余额--0.01元
	 */
	private String balance;
	/**
	 * 是否更新卡余额--false--未 更新true--已更新
	 */
	private Boolean updateCardBalance;
	
}
