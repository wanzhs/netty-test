package zc.entity;

/**
 *  充电桩上报最新一次充电信息
 * @author 63136
 *
 */
public class ParamTableCMD202 
{
	/**
	 * 充电桩编码--ASCII编码
	 */
	private String machineID;
	/**
	 * 流水单号--16字节数字非0开头流水单号
	 */
	private String transactionId;
	/**
	 * 充电枪类型--1-直流 2-交流
	 */
	private Integer gunType;
	/**
	 * 充电枪口
	 */
	private Integer gunid;
	/**
	 * 用户卡号/用户识别号--ASCII码（只刷卡充电时字段有效，非卡充电时，该段必须置0）
	 */
	private String userId;
	/**
	 * 充电开始时间--时间格式字符串--标准时间
	 */
	private String startDate;
	/**
	 * 充电结束时间--时间格式字符串--标准时间
	 */
	private String endDate;
	/**
	 * 充电时间长度
	 */
	private Integer totalChargeingDate;
	/**
	 * 开始SOC
	 */
	private Integer startSOC;
	/**
	 * 结束SOC
	 */
	private Integer endSOC;
	
	/**
	 * 本次充电电量
	 */
	private String totalChargeingElequantity;
 
	/**
	 *  充电前电表读数
	 */
	private String beforeChargingMeter;
	
	/**
	 * 充电后电表读数
	 */
	private String afterChargingMeter;
	/**
	 * 本次充电金额--总金额
	 */
	private String totalfare;
	/**
	 * 电费金额
	 */
	private String electifare;
	/**
	 * 服务费金额
	 */
	private String servicefare;
	/**
	 * 停车费金额
	 */
	private String parkingfare;
	/**
	 * 结束方式
	 * 0--刷卡结束
	 * 1--不刷卡结束
	 * 2--网络后台结束
	 */
	private Integer stopType;
	/**
	 * 充电前卡余额
	 */
	private String beforeChargeClance;
	/**
	 * 充电后卡余额
	 */
	private String afterChargeCardBalance;
	/**
	 * 是否已支付
	 * 0x01:已支付
	 * 0x00 未支付
	 */
	private Integer alreadypay;
	/**
	 * 充电策略
	 * 0:充满为止
	 * 1:时间控制充电
	 * 2:金额控制充电
	 * 3:电量控制充电
	 */
	private Integer strategy;
	/**
	 * 充电策略参数--时间单位为1秒金 额 单 位 为0.01元电量时单位为0.01kw
	 */
	private String strategyParam;
	/**
	 * 车辆 VIN--可选项，没有填’\0’
	 */
	private String vin;
	/**
	 * 车牌号--可选项，没有填’\0’
	 */
	private String platenum;
	/**
	 * 电量--json表--请参考：时段电量
	 */
	private String timeSectorElity;
	/**
	 * 启动方式
	 * 0：本地刷卡启动
	 * 1：后台启动
	 * 2：本地管理员启动
	 */
	private Integer startType;
	/**
	 * 结束原因状态个数--个数可以是一个或多个
	 */
	private Integer stopReasonNum;
	/**
	 * 状态1--请参考：充电桩状态与告警
	 */
	private String stopReason;
	/**
	 * 支付类型--Account： Card：
	 */
	private String payType;
	/**
	 * 用户卡号
	 */
	private String cardId;
	
}
