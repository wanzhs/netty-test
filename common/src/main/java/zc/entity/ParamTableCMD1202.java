package zc.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 *   充电桩对服务器下发广告灯控制指令的应答
 * @author 63136
 *
 */
@Data
@Accessors(chain = true)
public class ParamTableCMD1202 
{
 //充电桩编码--ASCII编码
   private String machineID;
	/**
	 * 结果确认--false-关 闭true-开启
	 */
	private Boolean result;
}
