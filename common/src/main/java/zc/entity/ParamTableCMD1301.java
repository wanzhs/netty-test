package zc.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 后台下发固定电费计价策略信息
 * @author 63136
 *
 */
@Data
@Accessors(chain = true)
public class ParamTableCMD1301 
{
 
	/**
	 * 每度电价--（元/度）
	 */
	private String electiPrice;
	
	/**
	 * 服务费单价--（元/度）
	 */
	private String servicePrice;
	
	/**
	 * 停车费--（元/小时）
	 */
	private String parkingPrice;
	
	
	/**
	 * 网页前端识别号--网页前端识别号
	 */
	private Integer CSID;
	 
	 
	 
	 
	
}
