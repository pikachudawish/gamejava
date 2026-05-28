package com.github.pikachudawish;

import com.github.pikachudawish.classes.GameHandler;
import com.github.pikachudawish.classes.Server;

public class serverGame extends Server{
    public serverGame(int port) {
        super(port);
    }

    @Override
    protected GameHandler getHandler() {
        return new GameHandler();
    }

    public static void main(String[] args) throws Exception {
        int port = 6767;

        new serverGame(port).run();
    }
}
