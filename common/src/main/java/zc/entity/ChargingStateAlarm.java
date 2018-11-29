package zc.entity;


import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 充电桩状态与告警
 * @author 63136
 *
 */
@Data
@Accessors(chain = true)
public class ChargingStateAlarm {
	/**
	 * 编码--告警状态与结束原因编码
	 */
	private Integer code;
	/**
	 * 名称--告警状态与结束原因含义
	 */
	private String info;
	
	public ChargingStateAlarm()
	{

	}
}
