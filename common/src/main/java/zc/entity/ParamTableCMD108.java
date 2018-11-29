package zc.entity;


import lombok.Data;
import lombok.experimental.Accessors;

/**
 *  充电桩开始充电命令
 * @author 63136
 *
 */
@Data
@Accessors(chain = true)
public class ParamTableCMD108 
{
 
	/**
	 * 充电桩编码--ASCII编码
	 */
	private String machineID;
	/**
	 *充电口号--枪号
	 */
	private Integer gunid;
	/**
	 * 流水单号
	 */
	private String transactionId;
	
	/**
	 * 用户识别号--ASCII编码
	 */
	private String userId;
	/**
	 *  开始充电开始时间--时间格式字符串--标准时间
	 */
	private String startChargingDate;
	/**
	 * 充电前余额
	 */
	private String beforeChargingnce;
	
	/**
	 * 充电前电表读数--0.01kwh
	 */
	private String beforeChargingMeter; 
	
	/**
	 * 充电启动方式
	 * 0：本地刷卡动
	 * 1：后台启动
	 * 2：本地管理启动
	 */
	private Integer chargeStartMode;
	/**
	 * 充电策略
	 * 0自动充满
	 * 1按时间充满
	 * 2定金额
	 * 3按电量充满
	 */
	private Integer strategy;
	/**
	 * 充电策略参数--时间单位为1秒金 额 单 位 为0.01元电量时单位为0.01kw
	 */
	private String strategyParam;
	/**
	 * 用户卡号--ASCII编码s
	 */
	private String cardId;
	
	
	
}
