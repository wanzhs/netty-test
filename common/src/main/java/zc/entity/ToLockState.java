package zc.entity;

/**
 * 地锁状态
 * @author 63136
 *
 */
public class ToLockState {
 
	/**
	 * 地锁地址--1枪对应地址1
	 */
	private Integer parkinglockAddr;
	/**
	 * 状态
	 * 00—闭锁 
	 * 01—开锁 
	 * 88—运动状态 
	 * 02-中间状态 0~90°
	 * 03-中间状态90~180°
	 * 77-通信异常
	 */
	private Integer state;
}
