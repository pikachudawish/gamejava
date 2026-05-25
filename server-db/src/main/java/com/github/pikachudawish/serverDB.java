package com.github.pikachudawish;

import com.pikachudawish.classes.ServerHandler;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioIoHandler;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public class serverDB {
    private int port;

    public serverDB(int port) {
        this.port = port;
    }

    public void run() throws Exception {
        EventLoopGroup bossGroup = new MultiThreadIoEventLoopGroup(1, NioIoHandler.newFactory());
        EventLoopGroup workerGroup = new MultiThreadIoEventLoopGroup(NioIoHandler.newFactory());

        try {
            ServerBootstrap b = new ServerBootstrap();
            b.group(bossGroup, workerGroup)
                    .channel(NioServerSocketChannel.class)
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        public void initChannel(SocketChannel ch) {
                            // É AQUI que a lógica começa: a "Pipeline"
                            // 1. Decoder (Transforma bytes em Objeto)
                            // 2. Encoder (Transforma Objeto em bytes)
                            // 3. O TEU HANDLER (A lógica do RPG/DB)
                            ch.pipeline().addLast(new ServerHandler());
                        }
                    })
                    .option(ChannelOption.SO_BACKLOG, 128)
                    .childOption(ChannelOption.SO_KEEPALIVE, true);

            // 2. Faz o Bind e começa a aceitar conexões (Síncrono aqui)
            ChannelFuture f = b.bind(port).sync();

            // 3. Espera até que o socket do servidor seja fechado
            f.channel().closeFuture().sync();
        } finally {
            workerGroup.shutdownGracefully();
            bossGroup.shutdownGracefully();
        }
    }

    public static void main(String[] args) throws Exception {
        int port = 6969;

        new serverDB(port).run();
    }
}
