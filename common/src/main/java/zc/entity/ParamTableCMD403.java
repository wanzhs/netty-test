package zc.entity;

 

/**
 *  服务器查询充电桩历史充电记录
 * @author 63136
 *
 */
public class ParamTableCMD403 
{
 
	 
	/**
	 * 查询记录起始索引--值越大表示越旧, 0表示从最新的充电开始查询
	 */
	private Integer recordStartIndex;
	/**
	 * 查询充电记录个数--0表示所有记录
	 */
	private Integer recordNum;
	
 
	
}
