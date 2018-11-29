package zc.core;

import lombok.Data;
import lombok.experimental.Accessors;
import zc.utils.Md5;

/**
 * 本通信协议采用json格式传输数据
 */
@Data
@Accessors(chain = true)
public class TCPData {
    /**
     * 命令  消息类型
     */
    private Integer CMD;
    /**
     * 数据域  每个消息类型的数据域，安装key值英文字母进行排序
     */
    private String DATA;
    /**
     * 校验码  数据域的校验码
     */
    private String CHECK;
    /**
     * 序列号  报文流水号
     */
    private Integer SN;

    /**
     * 空构造函数  供解码时使用
     */
    public TCPData() {
    }

    /**
     * 构造函数   供发送数据时使用
     *
     * @param cmd
     * @param sn
     * @param data
     */
    public TCPData(Integer cmd, Integer sn, String data) {
        this.CMD = cmd;
        this.DATA = data;
        this.SN = sn;
        this.CHECK = Md5.check(DATA);
    }
}
