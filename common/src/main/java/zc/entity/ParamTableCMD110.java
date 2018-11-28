package zc.entity;

 
/**
 *  充电桩正在充电中状态信息包
 * @author 63136
 *
 */
public class ParamTableCMD110 
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
	 * 充电枪类型 直流：1 交流：2
	 */
	private Integer gunType;
	/**
	 * 流水单号
	 */
	private String transactionId;
	/**
	 * 用户卡号/用户识别号
	 */
	private String userId;
	/**
	 * 充电前卡余额
	 */
	private String beforeChargingCardBalance;
	/**
	 * 充电总金额
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
	 * 当前SOC %（直流有效，交流置0）
	 */
	private Integer nowSOC;
	/**
	 * 本次充电累计充电费用
	 */
	private String chargingFace;
	/**
	 * 直流充电电压--充电有效（直流有效，交流置0）
	 */
	private String dcVoltage;
	/**
	 * 直流充电电流--充电有效（直流有效，交流置0）
	 */
	private String dcElectricity;
	/**
	 * BMS需求电压--充电有效（直流有效，交流置0）
	 */
	private String bmsVoltage;
	/**
	 * BMS需求电流--充电有效（直流有效，交流置0）
	 */
	private String bmsElectricity;
	/**
	 * BMS充电模式--充电有效（直流有效，交流置0）
	 */
	private String bmsChargeMode;
	/**
	 * 交流A相充电电压
	 */
	private String acAVoltage;
	/**
	 * 交流B相充电电压
	 */
	private String acBVoltage;
	/**
	 * 交流C相充电电压--交流桩状态为充电时才有效
	 */
	private String acCVoltage;
	/**
	 * 交流A相充电电流--直流桩表示三相输入电流
	 */
	private String acAElectricity;
	/**
	 * 交流B相充电电流
	 */
	private String acBElectricity;
	/**
	 * 交流C相充电电流--交流桩状态为充电时才有效
	 */
	private String acCElectricity;
	/**
	 * 剩余充电时间(min)充电有效（直流有效，交流置0）
	 */
	private Integer surplusChargingDate;
	
	/**
	 * 充电时长(秒)--充电有效（直流有效，交流置0）
	 */
	private Integer totalChargeingDate;
	
	/**
	 *本次充电累计充电电量--0.01kwh
	 */
	private String totalChargeingElequantity;
	/**
	 * 充电前电表读数--0.01kwh
	 */
	private String beforeChargingMeter;
	/**
	 * 当前电表读数 --0.01kwh
	 */
	private String chargingMeter;
	/**
	 * 用户卡号
	 */
	private String cardId;
 
	
}
