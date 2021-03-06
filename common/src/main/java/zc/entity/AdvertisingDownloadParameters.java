package zc.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 广告素材下载参数
 * @author 63136
 *
 */
@Data
@Accessors(chain = true)
public class AdvertisingDownloadParameters {
	
	/**
	 * 素材类型--“pixmap”:图片（目前只支持图片）
	 */
	private String type;
	/**
	 * 素材数量
	 */
	private Integer num;
	/**
	 * 素材展示时长--单张图片展示时长
	 */
	private Integer time;
	
	public AdvertisingDownloadParameters()
	{

	}
}
