package zc.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 *   充电桩上传心跳包信息
 * @author 63136
 *
 */
@Data
@Accessors(chain = true)
public class ParamTableCMD102 
{
 
	/**
	 * 充电桩编码--ASCII编码
	 */
	private String machineID;
	/**
	 *心跳序号--累加，到最大值时为 1，重新累加
	 */
	private Integer hbNum;
	 
	 
	 
	
}
