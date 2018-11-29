package zc.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 服务器应答充电桩上报BMS信息
 * @author 63136
 *
 */
@Data
@Accessors(chain = true)
public class ParamTableCMD301 
{
 
	/**
	 * 报文次序计数--从302上报的报文次序
	 */
	private Integer messageOrderNum;
	/**
	 * 充电枪号--从302上报电枪号
	 */
	private String gunid;
	 
	 
	
}
