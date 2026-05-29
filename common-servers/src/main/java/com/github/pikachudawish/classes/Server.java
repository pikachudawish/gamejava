package com.github.pikachudawish.classes;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.handler.timeout.IdleStateHandler;
import io.netty.channel.*;
import io.netty.channel.nio.NioIoHandler;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public abstract class Server {
    private int port;

    protected abstract ChannelHandler getHandler();

    public Server(int port) {
        this.port = port;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
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
                            ChannelPipeline pipeline = ch.pipeline();

                            pipeline.addLast(new IdleStateHandler(60, 30, 0));

                            //DECODER
                            pipeline.addLast(new io.netty.handler.codec.DelimiterBasedFrameDecoder(8192, io.netty.handler.codec.Delimiters.lineDelimiter()));
                            pipeline.addLast(new io.netty.handler.codec.string.StringDecoder());

                            //ENCODER
                            pipeline.addLast(new io.netty.handler.codec.string.StringEncoder());

                            //HEARTBEAT HANDLER
                            pipeline.addLast(new HeartbeatHandler());

                            //HANDLER
                            pipeline.addLast(getHandler());
                        }
                    })
                    .option(ChannelOption.SO_BACKLOG, 128)
                    .childOption(ChannelOption.SO_KEEPALIVE, true);

            ChannelFuture f = b.bind(port).sync();

            f.channel().closeFuture().sync();
        } finally {
            workerGroup.shutdownGracefully();
            bossGroup.shutdownGracefully();
        }
    }
}
