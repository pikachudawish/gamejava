package com.github.pikachudawish.classes;

import com.github.pikachudawish.classes.pkg.Pkg;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class GameHandler extends SimpleChannelInboundHandler<Pkg> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Pkg pkg) throws Exception {
        switch (pkg.getType()) {
            case HEARTBEAT -> {
                System.out.println("Ping recebido: " + ctx.channel().remoteAddress());
                break;
            }
        }
    }
}
