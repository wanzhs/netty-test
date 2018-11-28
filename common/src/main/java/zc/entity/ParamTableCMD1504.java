package zc.entity;

 

/**
 * 后台服务器应答充电桩地锁状态
 * @author 63136
 *
 */
public class ParamTableCMD1504 
{
 
	/**
	 * 充电桩编码--ASCII编码
	 */
	private String machineID;
	/**
	 * 地锁个数--整数
	 */
	private Integer parkinglockNum;
	/**
	 * 地锁1状态--Json表--请参考：地锁状态
	 */
	private String parkinglockStatus;
	 
	
}
