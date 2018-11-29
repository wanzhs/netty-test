package zc.entity;


import lombok.Data;
import lombok.experimental.Accessors;

/**
 *   充电桩状态信息包上报
 * @author 63136
 *
 */
@Data
@Accessors(chain = true)
public class ParamTableCMD104 
{
 
	/**
	 * 充电桩编码--ASCII编码
	 */
	private String machineID;
	/**
	 * 充电枪数量
	 */
	private Integer gunNum;
	/**
	 * 充电口号
	 */
	private Integer gunid;
	/**
	 *充电枪类型 1=直流； 2=交流；
	 */
	private Integer gunType;
	/**
	 * 工作状态
	 * 0-空闲中
	 * 1-正准备开始充电
	 * 2-充电进行中
	 * 3-充电结束
	 * 4-启动失败
	 * 5-预约状态
	 * 6-系统故障(能给汽车充电
	 * 7-充电枪被占用（双枪充电只能用单枪时不能用的另一枪报此状态）
	 */
	private Integer gunStatus;
	/**
	 * 车连接状态
	 * 0- 断开 
	 * 1-半连接 
	 * 2-连接直流目前只有和2状态交流目前有0、1、2三种状态
	 */
	private Integer connectStatus;
	/**
	 * 状态个数--个数可以是一个或多个
	 */
	private Integer statusNum;
	/**
	 * 状态--Json表--请参考：充电桩状态与告警
	 */
	private Integer warningStatus;
}
