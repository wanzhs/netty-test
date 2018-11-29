package zc.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 *  后台服务器向充电桩下发地锁控制指令
 * @author 63136
 *
 */
@Data
@Accessors(chain = true)
public class ParamTableCMD1501 
{
 
	/**
	 * 地锁地址--1枪对应地址1
	 */
	private Integer parkinglockAddr;
	
	/**
	 * 开关控制--false- 关 闭true-开启
	 */
	private Boolean switchControl;
	
}
