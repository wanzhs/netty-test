package zc.entity;

/**
 * 充电桩上报BMS信息
 * @author 63136
 *
 */
public class ParamTableCMD302 
{
 
	/**
	 * 充电桩编码--ASCII编码
	 */
	private String machineID;
	/**
	 * 报文次序计数--从1开始计数，溢出后重新从1开始计数
	 */
	private Integer messageOrderNum;
	/**
	 * 充电枪号--充电枪号
	 */
	private Integer gunid;
	/**
	 * 充电桩与 BMS 通信协议版本号--遵循 27930 最新协议标准
	 */
	private String chargepileBmsVersion;
	/**
	 * BMS 与充电桩通信协议版本号--遵循 27930 最新协议标准
	 */
	private String bmsChaegepileVersion;
	/**
	 * 电池类型
	 * 电池类型，01H：
	 * 铅酸电池；02H：
	 * 镍氢电池；03H：
	 * 磷酸铁锂电池；04H：
	 * 锰酸锂电池；05H：
	 * 钴酸锂电池；06H：
	 * 三元材料电池；07H：
	 * 聚合物锂离子电池；08H：
	 * 钛酸锂电池；FFH：
	 * 其他电池
	 */
	private String batteryType;
	/**
	 * 最高允许温度
	 * 数据分辨率：1ºC/位，-50 ºC偏移量；数据范围：-50ºC~+200 ºC
	 */
	private String maxTemp;
	/**
	 *BMS 最高允许充电电压
	 *数据分辨率：0.1 V /位，0 V偏移量
	 */
	private String bmsMaxVoltage;
	/**
	 * 单体最高允许充电电压
	 * 数据分辨率：0.01 V/位，0 V偏移量； 数据范围：0~24 V
	 */
	private String chargingMaxVoltage;
	/**
	 * 最高允许充电电流
	 * 数据分辨率：0.1 A/位；-400A偏移； 数据范围：-400.0A~0.0A
	 */
	private String maxElectricity;
	/**
	 * 整车动力蓄电池额定总电压--数据分辨率：0.1 V/位；0V 偏移
	 */
	private String ratedVoltageVehie;
	/**
	 *整车动力蓄电池当前电压--数据分辨率：0.1 V/位；0V 偏移
	 */
	private String nowVoltageVehicle;
	/**
	 * 整车动力蓄电池额定容量--0.1 Ah /位，0 Ah偏移量
	 */
	private String batteryRatedVolVehicle;
	/**
	 * 整车动力蓄电池标称能量
	 * 数据分辨率：0.1 kWh/位，0kWh 偏移量；数据范围：0~1000 kWh；
	 */
	private String energyBatteryVehicle;
	/**
	 * 整车动力蓄电池荷电状态--数据分辨率：0.1%/位，0%偏移量； 数据范围： 0~100%；
	 */
	private String statusBatteryVehicle;
	/**
	 * 充电机最高输出电压--数据分辨率：0.1 V/位；0V 偏移
	 */
	private String maxOutVoltage;
	/**
	 * 充电机最低输出电压--数据分辨率：0.1 V/位；0V 偏移
	 */
	private String minOutVoltage;
	/**
	 * 充电机最大输出电流
	 * 数据分辨率：0.1 A/位；-400A偏移数据范围：-400.0A~0.0A
	 */
	private String maxOutElectricity;
	/**
	 * 充电机最小输出电流--数据分辨率：0.1 A/位；-400A偏移数据范围：-400.0A~0.0A
	 */
	private String minOutElectricitye;
	/**
	 * 车辆识别码VIN--ASCII
	 */
	private String vin;
	
	
	/**
	 * 充电输出电压
	 * 数据分辨率：0.1 V/位，0 V偏移量；数据范围：0.0 V~950.0V
	 */
	private String chargingOutVoltage;
	/**
	 *充电输出电流
	 *数据分辨率：0.1 A/位；-400A偏移；数据范围：-400.0A~0.0 A 
	 */
	private String chargingOutElectricity;
	/**
	 * SOC
	 * 数据分辨率：1%/位，0%偏移量；数据范围：0%~100%
	 */
	private String soc;
	/**
	 * 电池组最低温度
	 *数据分辨率：0.1 ℃/位，-50 ℃偏移量；数据范围：-50.0 ℃~+200.0 ℃
	 */
	private String batteryGroupMinTemp;
	/**
	 * 电池组最高温度
	 * 数据分辨率：0.1 ℃/位，-50 ℃偏移量数据范围：-50.0 ℃~+200.0 ℃
	 */
	private String batteryGroupMaxTemp;
	/**
	 * 单体电池最高电压
	 * 数据分辨率：0.01 V/位，0 V偏移量；数据范围 0.00V~24.00 V
	 */
	private String batteryMaxVoltage;
	/**
	 * 单体电池最低电压
	 * 数据分辨率：0.01 V/位，0 V偏移量；数据范围 0.00V~24.00 V
	 */
	private String batteryMinVoltage;
	
	/**
	 * 充电机环境温度 
	 * 数据分辨率：0.1 ℃/位，-50 ℃偏移量数据范围：-50.0 ℃~+90.0 ℃
	 */
	private String evnTemp;
	/**
	 * 充电导引电压
	 * 数据分辨率：0.01 V/位，0 V偏移量；数据范围 0.00V~30.00 V
	 */
	private String chargeGuideVoltage;
	/**
	 *BMS 需求电压
	    * 数据分辨率：0.1 V/位，0 V偏移量；数据范围：0.0 V~950.0V
	 */
	private String bmsNeedVoltage;
	/**
	 *BMS 需求电流
	    *数据分辨率：0.1 A/位；-400A偏移；数据范围：-400.0A~0.0 A
	 */
	private String bmaNeedElectricity;
	/**
	 * 充电模式
	 *1--恒压充电
	 *2--恒流充电
	 */
	private Integer chargeMode;
	/**
	 * BMS 充电电压测量值
	 * 数据分辨率：0.1 V/位，0 V偏移量；数据范围：0.0 V~950.0V
	 */
	private String bmsChargingVoltage;
	/**
	 *BMS 充电电流测量值
	    * 数据分辨率：0.1 A/位；-400A偏移；数据范围：-400.0A~0.0 A
	 */
	private String bmsChargingElectricity;
	/**
	 * 估算剩余充电时间
	 * 数据分辨率：1min/位，0 min偏移量；数据范围：0~600 min
	 */
	private String surplusChargingDate;
	
	/**
	 * 充电枪温度 1
	 *  数据分辨率：0.1 ℃/位，-50 ℃偏移量；数据范围：-50.0 ℃~+90.0 ℃
	 */
	private String chargeGunTemp1;
	/**
	 * 充电枪温度 2
	 * 数据分辨率：0.1 ℃/位，-50 ℃偏移量；数据范围：-50.0 ℃~+90.0 ℃
	 */
	private String chargeGunTemp2;
	/**
	 * 充电枪温度 3
	 * 数据分辨率：0.1 ℃/位，-50 ℃偏移量；数据范围：-50.0 ℃~+90.0 ℃
	 */
	private String chargeGunTemp3;
	/**
	 * 充电枪温度 4
	 * 数据分辨率：0.1 ℃/位，-50 ℃偏移量；数据范围：-50.0 ℃~+90.0 ℃
	 */
	private String chargeGunTemp4;
	
	/**
	 * 流水单号
	 */
	private String transactionId;
	
	
	
	
	
}
