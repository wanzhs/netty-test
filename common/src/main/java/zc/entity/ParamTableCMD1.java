package zc.entity;

import java.util.Date;

import javax.lang.model.type.PrimitiveType;

import ch.qos.logback.core.rolling.SizeAndTimeBasedRollingPolicy;

/**
 * 后台服务器下发充电桩工作参数
 * @author 63136
 *
 */
public class ParamTableCMD1 
{
	//充电桩编码--ASCII码
	private  String piledeviceid;
	//充电桩项目类型--“DC” “AC”
	private  String piletype;
	//充电枪个数--内部参数，一般用于查询
	private Integer gunnum=0;
	//充电单元协议编号--“1.00” “1.10”
	private String chargeUnitVer;
	//读卡器类型--1:MFRC523-V1读卡器 2:MFRC523-V2读卡器 硬件决定的，运营的后台设置或查询此项
	private Integer readertype;
	//标准时钟时间
	private Date dateTime;
	//管理员密码
	private String adminpwd;
	//操作员密码
	private String engineerpwd;
	//MAC地址
	private String pilemac;
	//充电模式--0-均充 1-轮充 2-自动分配
	private Integer chargemode;
	//SOC递增1%最大时间--单位分钟
	private Integer maxsoc1time;
	//整桩最高温度整形
	private Integer maxsystemp;
	//自动关总电源使能--“true”或者“false”
	private Integer autopwrdown;
	//自动关总电源时间（设备检测空闲多少时间关总电源）--单位分钟
	private Integer autopwrdowntime;
	//中心服务器地址--域名或者IP
	private String serverip;
	//中心服务器端口
	private Integer serverport;
	//签到时间间隔--按照分钟为单位（默认 30 分)
	private Integer loginInterval;
	//心跳上报周期--单位秒
	private Integer hbInterval;
	//充电桩状态信息报上报周期--单位秒
	private Integer stateInterval;
	//立即上报一次签到106报文--“true”或者“false”
	private String uplogin;
	//立即上报一次桩状态信息104报文--“true”或者“false”
	private String upstate;
	//下载APP二维码
	private String appQRCode;
	//支付二维码
	private String payQRCode;
	//广告灯开启起始时间--时间格式字符串
	private String adverStartTime;
	//广告灯关闭起时间--时间格式字符串
	private String adverEndTime;
	//刷卡网络鉴权--“true”或者“false”
	private String cardnetAuth;
	//取消预约充电--“true”或者“false”
	private String canclebooking;
	//设备重启--“true”或者“false”
	private String pilereboot;
	//应用重启--“true”或者“false”
	private String appreboot;
	//启用二维码充电--“true”或者“false”
	private String qrcodeCharge;
	//模块开机--“true”或者“false”
	private String modulePower;
	//停止充电--“true”或者“false”
	private String pilePower;
	//后台验证--“true”或者“false”
	private String serverAuth;
	//车牌验证--“true”或者“false”
	private String carnumAuth;
	//车卡VIN绑定--“true”或者“false”
	private String carvinBind;
	//背光节能控制--“true”或者“false”
	private String backlightEnable;
	//空闲进入背光调节时间--单位秒（默认30秒）
	private Integer backlighttime;
	//节能时背光亮度--0%~100%
	private Integer backlightval;
	//功率调节(限制输出功率)--10%~100%
	private Integer powerctrl;
	//地锁延时关闭时间--单位分钟（默认5分钟）
	private Integer lockofftime;
	//地锁检测时间--单位秒（默认20秒）
	private Integer lockchektime;
	//地锁使能--“true”或者“false”
	private String lockEnable;
	//地锁蜂鸣器--“true”或者“false”
	private String lockbeep;
	//停止充电SOC--0%~100%
	private Integer stopChargingSOC;
	//暂停枪充电功能--Json格式数据（格式详看枪暂停状态）
	private String suspendGun;
	
	
 
}
