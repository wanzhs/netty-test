package zc.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 *  充电桩对后台下发的充电桩开启充电控制应答
 * @author 63136
 *
 */
@Data
@Accessors(chain = true)
public class ParamTableCMD8 
{
	/**
	 * 充电桩编码--ASCII编码
	 */
	private String machineID;
	/**
	 * 充电枪口--同服务发送枪口
	 */
	private Integer gunid;
	/**
	 * 状态个数--个数可以是多个
	 */
	private Integer statusNum;
	/**
	 * 状态1--json表--请参考：充电桩状态与告警
	 */
	private String warningStatus;
	
	/**
	 * 充电生效类型  
	 * 0:即时充电
	 * 2:预约充电
	 * 5：未支付停止充电
	 * 6：已支付停止充电
	 */
	private Integer chargingType;
	 
	
}
