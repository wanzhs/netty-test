package zc;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import zc.core.MsgTransfer;
import zc.core.MyProtocolBean;
import zc.params.ParamTableCMD1;
import zc.params.User;

/**
 * Created by yaozb on 15-4-11.
 */
public class NettyServerHandler extends SimpleChannelInboundHandler<MyProtocolBean> {

    @Override
    protected void messageReceived(ChannelHandlerContext channelHandlerContext, MyProtocolBean msg) throws Exception {
        MyProtocolBean baseMsg=(MyProtocolBean) msg;
        ObjectMapper objectMapper=new ObjectMapper();
        MsgTransfer msgTransfer=objectMapper.readValue(baseMsg.getContent(),MsgTransfer.class);
        switch (msgTransfer.getCmd()){
            case 1:{
                User user=objectMapper.readValue(msgTransfer.getData(),User.class);
                System.out.println("客户端信息："+user.toString());
            }break;
            case 2:{
                ParamTableCMD1 user=objectMapper.readValue(msgTransfer.getData(),ParamTableCMD1.class);
                System.out.println("客户端信息："+user.toString());
            }break;
        }

    }
}
