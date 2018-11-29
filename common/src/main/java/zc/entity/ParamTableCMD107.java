package zc.entity;


import lombok.Data;
import lombok.experimental.Accessors;

/**
 *  服务器应答充电桩开始充电命令
 * @author 63136
 *
 */
@Data
@Accessors(chain = true)
public class ParamTableCMD107 
{
 
	/**
	 *充电口号--枪号
	 */
	private Integer gunid;
	 
	
}
