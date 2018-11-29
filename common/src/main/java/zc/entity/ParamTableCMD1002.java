package zc.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 *  充电桩应答服务器下载命令
 * @author 63136
 *
 */
@Data
@Accessors(chain = true)
public class ParamTableCMD1002 
{
 
	/**
	 * 充电桩编码--ASCII
	 */
	private String machineID;
	
	/**
	 *应答命令--“CMD_advert”:下载广告素材
	 */
	private String ackCMD;
	
	/**
	 *返回結果--true 操 作 成 功false失败
	 */
	private Integer result;
	
	/**
	 * 网页前端识别号--网页前端识别号
	 */
	private String CSID;
	 
	
}
