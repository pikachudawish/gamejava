package com.github.pikachudawish.classes;

import com.github.pikachudawish.classes.pkg.*;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class ServerHandler extends ChannelInboundHandlerAdapter {
    public void channelRead(ChannelHandlerContext ctx, pkg p) throws Exception {
        switch (p.getType()) {
            case HEARTBEAT ->


                break;

            default -> System.err.println("ERROR");
        }
    }
}
