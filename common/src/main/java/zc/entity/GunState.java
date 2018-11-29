package zc.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 枪状态
 * @author 63136
 *
 */
@Data
@Accessors(chain = true)
public class GunState {
	/**
	 * 充电枪口
	 */
	private Integer gunid;
	/**
	 * 状态“open”：开启运营   “suspend”：暂停运营  “close”：关闭运营
	 */
	private String state;

	public GunState() {
	}
}
