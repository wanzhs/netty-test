package zc.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 充电桩回应后台下发的固定电费计价测率信息
 * @author 63136
 *
 */
@Data
@Accessors(chain = true)
public class ParamTableCMD1302 
{
 
	/**
	 * 充电桩编码--ASCII编码
	 */
	private String machineID;
	
	/**
	 * 确认结果--true--成功 false--失败
	 */
	private Boolean result;
	
	/**
	 * 网页前端识别号--网页前端识别号
	 */
	private Integer CSID;
	 
	 
	 
	 
	
}
