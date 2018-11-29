package zc.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 服务器应答帐户查询信息
 * @author 63136
 *
 */
@Data
@Accessors(chain = true)
public class ParamTableCMD203 
{
 
	/**
	 * 充电枪口
	 */
	private Integer gunid;
	/**
	 * 用户卡号/用户识别号--ASCII码（只刷卡充电时字段有效，非卡充电时，该段必须置0）
	 */
	private String cardId;
	 
	/**
	 * 响应码
	 * 0：有效账户
	 * 1：非法账户
	 * 2--该卡已经在另外一个充电桩上充电，不允许一张卡同时在多台充电桩上充电
	 */
	private Integer responseCode;
	 
	
	/**
	 * 帐户余额
	 */
	private String balance;
 
 
	/**
	 * 全时段电费费率
	 */
	private Integer electricityRate;
	/**
	 * 服务费率
	 */
	private Integer serviceRate;
	/**
	 * 充电密码验证--false-不验 证true-验证
	 */
	private Boolean chargePasswordVer;
	/**
	 * 验证VIN标志--false-不验 证true-验证
	 */
	private Boolean vinVer;
	/**
	 * 车牌验证--false-不验 证true-验证
	 */
	private Boolean platenumVer;
	/**
	 * 余额指示
	 * 0- 余 额 不 足
	 * 1-余额充足 
	 * 2-余额校验有误，需要把后台余额写入卡
	 * 3-余额校验有误，不允许充电
	 */
	private Integer balanceFlag;
	/**
	   *用户卡内密码--最长为6位数的整形纯数字密码
	 */
	private String userCardPassword;
 
	 
	/**
	 * 用户名称
	 */
	private String userId;
	
}
