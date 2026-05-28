package com.github.pikachudawish;

import com.github.pikachudawish.classes.*;
import io.netty.channel.ChannelHandler;

public class serverDatabase extends Server{
    public serverDatabase(int port) {
        super(port);
    }

    @Override
    protected ChannelHandler getHandler() {
        return new DatabaseHandler();
    }

    public static void main(String[] args) throws Exception {
        int port = 6969;

        new serverDatabase(port).run();
    }
}
