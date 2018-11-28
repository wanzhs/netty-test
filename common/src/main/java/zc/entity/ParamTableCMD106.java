package zc.entity;

 

/**
 *  充电桩签到信息上报
 * @author 63136
 *
 */
public class ParamTableCMD106 
{
	/**
	 * 充电桩编码--ASCII编码
	 */
	private String machineID;
	/**
	 * 充电桩软件版本
	 */
	private String softVersion;
	/**
	 * 充电桩类型-- 第一个字节为供应商编码（范围01~FF）；第二个字节为电桩类型编码（范围01~FF），具体编码值由我司后台生成，各供应商有新电桩类型接入时，请向我司索要编码
	*/
	private String chargepileType;
	/**
	 * 启动次数--终端每次启动，计数保存
	 */
	private Integer startNum;
	/**
	 * 数据上传模式--1：应答模式 2：主动上报模式
	 */
	private Integer uploadMode;
	/**
	 * 签到间隔时间--签到时间单位分钟
	 */
	private Integer loginIntervalDate;
	/**
	 * 充电枪个数
	 */
	private Integer gunNum;
	/**
	 * 心跳上报周期
	 */
	private Integer hbCycle;
	/**
	 * 心跳包检测超时次数
	 */
	private Integer hbTimeoutNum;
	/**
	 * 充电记录数量
	 */
	private Integer chargeRecordNum;
	/**
	 * 当前充电桩系统时间--时间格式字符串--标准时间
	 */
	private String currentDate;
	/**
	 * 最近一次充电时间--时间格式字符串--标准时间
	 */
	private String lastChargingDate;
	/**
	 * 最近一次启动时间--时间格式字符串--标准时间
	 */
	private String lastStartDate;
	/**
	 * 签到密码--MD5码32字节
	 */
	private String loginPassword;
	/**
	 * 充电桩Mac地址或者IMEI码--ASCII编码 以’\0’结束例：MAC：70-77-81-A0-42-FF IMEI：355065 05331100 1
	 */
	private String macAddr;
	/**
	 * 硬件版本
	 */
	private String hardWareVersion;
	
}
