package com.github.pikachudawish.classes;

import com.github.pikachudawish.classes.pkg.Pkg;
import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;

public class HeartbeatHandler extends ChannelDuplexHandler {

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (evt instanceof IdleStateEvent e) {

            if (e.state() == IdleState.WRITER_IDLE) {
                Pkg hb = new Pkg();
                ctx.writeAndFlush(hb);
            } else if (e.state() == IdleState.READER_IDLE) {
                ctx.close();
            }
        }
    }
}