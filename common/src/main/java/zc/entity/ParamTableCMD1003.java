package zc.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 *  服务器应答充电桩状态
 * @author 63136
 *
 */
@Data
@Accessors(chain = true)
public class ParamTableCMD1003 
{
 
	/**
	 * 应答结果--true:正确false:错误
	 */
	private Boolean ack;
	 
	 
	
}
