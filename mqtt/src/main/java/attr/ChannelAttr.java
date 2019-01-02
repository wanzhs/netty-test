package attr;

import io.netty.channel.Channel;
import io.netty.util.Attribute;
import io.netty.util.AttributeKey;
import lombok.extern.slf4j.Slf4j;

/**
 * @author:wanzhongsu
 * @description: 管道属性管理
 * @date:2019/1/2 19:06
 */
@Slf4j
public class ChannelAttr {
    /**
     * 用户code
     */
    public static final AttributeKey<String> _USERCODE = AttributeKey.valueOf("USERCODE");

    private enum Singleton {
        INSTANCE;
        private ChannelAttr singleton;

        Singleton() {
            singleton = new ChannelAttr();
        }

        public ChannelAttr getInstance() {
            return singleton;
        }
    }

    public static ChannelAttr getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

    public <T> void setAttr(Channel channel, AttributeKey<T> key, T value) {
        Attribute<T> attribute = channel.attr(key);
        attribute.set(value);
    }

    public <T> T getAttr(Channel channel, AttributeKey<T> key, T defaultValue) {
        Attribute<T> attribute = channel.attr(key);
        T attr = attribute.get();
        if (attr == null) {
            return defaultValue;
        } else {
            return attr;
        }
    }
}
