package zc.entity;

/**
 * 充电桩对服务器下发地锁控制指令的应答
 * @author 63136
 *
 */
public class ParamTableCMD1502 
{
 
	/**
	 * 充电桩编码--ASCII编码
	 */
	private String machineID;
	/**
	 * 地锁地址--1枪对应地址1
	 */
	private Integer parkinglockAddr;
	
	/**
	 * 结果确认--false- 关 闭true-开启
	 */
	private Boolean result;
	
}
