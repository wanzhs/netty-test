package zc.core;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class MsgTransfer {
    /**
     * 命令  消息类型
     */
    private Integer cmd;
    /**
     * 数据域  每个消息类型的数据域，安装key值英文字母进行排序
     */
    private String data;
    /**
     * 校验码  数据域的校验码
     */
    private String check;
    /**
     * 序列号  报文流水号
     */
    private Integer sn;

    public MsgTransfer() {
    }

}
