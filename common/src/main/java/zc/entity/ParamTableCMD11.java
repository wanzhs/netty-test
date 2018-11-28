package zc.entity;

/**
 *   后台服务器应答充电桩用户扫码状态
 * @author 63136
 *
 */
public class ParamTableCMD11 
{
 
	 
	/**
	 * 充电枪口--同服务发送枪口
	 */
	private Integer gunid;
	/**
	 * 二维码操作状态--0x01 已扫码成功 0x02 支付成功
	 */
	private Integer qrStatus;
	 
	 
	
}
