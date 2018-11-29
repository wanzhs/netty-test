package zc.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 *  后台服务器向充电桩下发广告灯控制指令
 * @author 63136
 *
 */
@Data
@Accessors(chain = true)
public class ParamTableCMD1201 
{
 
	/**
	 * 开关控制--false-关 闭true-开启
	 */
	private Boolean switchControl;
}
