package com.github.pikachudawish.classes;

import com.github.pikachudawish.classes.dbManager;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.sql.Connection;

public class ServerHandler extends ChannelInboundHandlerAdapter {
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {


        try (Connection conn = dbManager.getConnection()) {

        } catch (Exception e) {
            //e.printStackTrace();
        }
    }
}
