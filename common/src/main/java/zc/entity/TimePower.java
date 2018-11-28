package zc.entity;


/**
 * 时段电量
 * @author 63136
 *
 */
public class TimePower {
	/**
	 * 时段--一天24小时，按照每半个小时，分一个时段，0号时段表示00：00~00：30；1号时段表示00：30~01：00；以此类推
	 */
	private Integer timeSector;
	/**
	 * 电量--0.01kwh
	 */
	private String electricity;
}
