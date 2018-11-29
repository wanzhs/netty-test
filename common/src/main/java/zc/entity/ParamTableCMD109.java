package zc.entity;


import lombok.Data;
import lombok.experimental.Accessors;

/**
 *  服务器应答充电中状态信息包
 * @author 63136
 *
 */
@Data
@Accessors(chain = true)
public class ParamTableCMD109 
{
 
	/**
	 *充电口号--枪号
	 */
	private Integer gunid;
	 
	
}
