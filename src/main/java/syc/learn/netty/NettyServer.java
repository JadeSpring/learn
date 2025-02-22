package syc.learn.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.util.AttributeKey;

/**
 * @author syc
 * @date 2024/1/8
 */
public class NettyServer {

    public static void main(String[] args) {

        ServerBootstrap serverBootstrap = new ServerBootstrap();

        NioEventLoopGroup boss = new NioEventLoopGroup();

        NioEventLoopGroup worker = new NioEventLoopGroup();

        serverBootstrap
                .group(boss, worker)
                .attr(AttributeKey.valueOf("serverName1"), "nettyServer")
                .attr(AttributeKey.valueOf("serverPort1"), 8000)
                .channel(NioServerSocketChannel.class)
                .handler(new ChannelInitializer<NioServerSocketChannel>() {
                    @Override
                    protected void initChannel(NioServerSocketChannel ch) throws Exception {
                        System.out.println("服务端启动~");
                        System.out.println(ch.attr(AttributeKey.valueOf("serverName1")));
                        System.out.println(ch.attr(AttributeKey.valueOf("serverPort1")));
                    }
                })
                .option(ChannelOption.SO_BACKLOG, 1024)
                .childAttr(AttributeKey.valueOf("clientKey"), "c_K")
                .childOption(ChannelOption.SO_KEEPALIVE, true)
                .childOption(ChannelOption.TCP_NODELAY, true)
                .childHandler(new ChannelInitializer<NioSocketChannel>() {

                    @Override
                    protected void initChannel(NioSocketChannel ch) {
                        System.out.println(ch.attr(AttributeKey.valueOf("clientKey")));
                        ch.pipeline().addLast(new StringDecoder());

                        ch.pipeline().addLast(new SimpleChannelInboundHandler<String>() {

                            @Override

                            protected void channelRead0(ChannelHandlerContext ctx, String msg) {

                                System.out.println(msg);

                            }

                        });

                    }

                });
        bind(serverBootstrap, 8000);
    }

    private static void bind(final ServerBootstrap serverBootstrap, final int port) {

        serverBootstrap.bind(port).addListener(future -> {

            if (future.isSuccess()) {
                System.out.println("端口［" + port + "］绑定成功！");
            } else {

                System.err.println("端口［" + port + "］绑定失败！");

                bind(serverBootstrap, port + 1);

            }

        });

    }
}
