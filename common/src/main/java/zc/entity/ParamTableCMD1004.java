package zc.entity;

/**
 *  充电桩上报下载进度
 * @author 63136
 *
 */
public class ParamTableCMD1004 
{
 
	/**
	 * 充电桩编码--ASCII
	 */
	private String machineID;
	
	/**
	 *下载进度--0%-100%
	 */
	private Integer progress;
	
	/**
	 *更新完毕
	 *1:完毕
	 *2：更新中
	 *3：下载中
	 *4：下载完毕
	 */
	private Integer updateFinish;
	 
	
}
