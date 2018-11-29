package zc.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 充电桩应答服务器设置工作参数
 * @author 63136
 *
 */
@Data
@Accessors(chain = true)
public class ParamTableCMD2 
{
	//充电桩编码--ASCII码
	private String piledeviceid;
	//操作应答状态--“success” “faulure”
	private String state;
	
}
