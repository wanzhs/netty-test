package zc.entity;

/**
 * 后台服务器下发充电桩开启充电控制命令
 * @author 63136
 *
 */
public class ParamTableCMD7 
{
	/**
	 * 充电枪口--只有一机一桩此参数可为0
	 */
	private Integer gunid;
	/**
	 * 流水单号
	 */
	private String transactionId;
	/**
	 * 充电生效类型
	 * 0:即时充电 
	 * 2:预约充电 
	 * 5：未支付停止充电
	 */
	private Integer chargingType;
	/**
	 * 用户余额--余额单位为0.01元
	 */
	private String balance;
	/**
	 * 充电策略
	 * 
	 * 0:充满为止（默认）
	 * 1:时间控制充电
     * 2:金额控制充电
     * 3:电量控制充电
	 */
	private String strategy;
	/**
	 * 充电策略参数--时间单位为1秒金额单位为0.01元电量时单位为0.01kw
	 */
	private String strategyParam;
	/**
	 * 用户识别号(App) --ASCII码，不够长度填’\0’
	 */
	private String userId;
	/**
	 * 用户卡号--ASCII码，不够长度填’\0’（选填，支付类型为卡时，填写该字段）
	 */
	private String cardId;
	/**
	 * 支付方式--“account”：账户“card”：卡
	 */
	private String payType;
	/**
	 * 时段电价 --Json表--请参靠：时段电价
	 */
	private String electiPrice;
	/**
	 * 服务费单价--（元/度）
	 */
	private String servicePricce;
	/**
	 * 停车费--（元/小时）
	 */
	private String parkingPrice;
	/**
	 * 是否离线充电--“true”:允许“false”：不允许
	 */
	private Boolean offlineChargeEnable;
	/**
	 *  离线充电电量--0.01KW
	 */
	private String offlineChargeElec;
	/**
	 * 停止充电SOC--0%~100%
	 */
	private Integer stopChargingSOC;
	
}
