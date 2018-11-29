package zc;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import zc.core.ProtocolBean;
import zc.core.TCPData;
import zc.entity.ParamTableCMD1;
import zc.params.User;

/**
 * Created by yaozb on 15-4-11.
 */
public class NettyServerHandler extends SimpleChannelInboundHandler<ProtocolBean> {

    @Override
    protected void messageReceived(ChannelHandlerContext channelHandlerContext, ProtocolBean msg) throws Exception {
        ProtocolBean baseMsg=msg;
        ObjectMapper objectMapper=new ObjectMapper();
        TCPData msgTransfer=objectMapper.readValue(baseMsg.getContent(), TCPData.class);
        switch (msgTransfer.getCMD()){
            case 1:{
                ParamTableCMD1 data=objectMapper.readValue(msgTransfer.getDATA(),ParamTableCMD1.class);
                System.out.println("客户端信息ParamTableCMD1："+data.toString());
            }break;
            case 2:{
                ParamTableCMD1 user=objectMapper.readValue(msgTransfer.getDATA(),ParamTableCMD1.class);
                System.out.println("客户端信息："+user.toString());
            }break;
        }

    }
}
