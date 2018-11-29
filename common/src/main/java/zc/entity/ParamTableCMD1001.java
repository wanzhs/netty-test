package zc.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 *  服务器下发下载命令
 * @author 63136
 *
 */
@Data
@Accessors(chain = true)
public class ParamTableCMD1001 
{
 
	/**
	 * 操作命令--“CMD_advert”:下载广告素材
	 */
	private String controlCMD;
	
	/**
	 * 服务器地址
	 */
	private String url;
	
	/**
	 * 下载文件md5校验值
	 */
	private String checksum;
	
	
	/**
	 * 设备下载失败重试次数
	 */
	private Integer retries;
	
	/**
	 * 执行下载的时间--时间格式字符串--如未设置，则充电桩接收后立即下载升级文件升级
	 */
	private String retryDate;
	
	/**
	 * 重试间隔时间--单位秒
	 */
	private Integer retryInterval;
	
	/**
	 * 网页前端识别号--网页前端识别号
	 */
	private String CSID;
	
	/**
	 * 参数--JSON格式--详看对应的json表格
	 */
	private String parameters;
	 
	 
	 
	
}
