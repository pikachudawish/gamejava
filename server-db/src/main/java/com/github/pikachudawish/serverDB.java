package com.github.pikachudawish;

import com.github.pikachudawish.classes.*;
import io.netty.channel.ChannelHandler;

public class serverDB extends Server{
    public serverDB(int port) {
        super(port);
    }

    @Override
    protected ChannelHandler getHandler() {
        return new DatabaseHandler();
    }

    public static void main(String[] args) throws Exception {
        int port = 6969;

        new serverDB(port).run();
    }
}
