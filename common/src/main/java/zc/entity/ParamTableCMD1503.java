package zc.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 后台服务器应答充电桩地锁状态
 * @author 63136
 *
 */
@Data
@Accessors(chain = true)
public class ParamTableCMD1503 
{
 
	/**
	 * 应答确认--false- 关 闭true-开启
	 */
	private Boolean ack;
	 
	
}
