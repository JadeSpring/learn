package syc.learn.netty.pratice;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.ServerSocketChannel;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioChannelOption;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.string.StringDecoder;

import java.util.concurrent.TimeUnit;

/**
 * @author syc
 * @date 2024/1/13
 */
public class NettyServer {
    public static void main(String[] args) {
        // “线程模型、IO模型、业务处理”

        // net.x52im.mobileimsdk.server bootstrap
        ServerBootstrap serverBootstrap = new ServerBootstrap();

        // 线程模型
        EventLoopGroup boss = new NioEventLoopGroup();
        EventLoopGroup worker = new NioEventLoopGroup();

        serverBootstrap.group(boss, worker);

        // 这个设置表示系统用于临时存放已完成三次握手的请求的队列的最大长度
        serverBootstrap.option(ChannelOption.SO_BACKLOG, 10);
        //
        serverBootstrap.childOption(ChannelOption.TCP_NODELAY, true);
        serverBootstrap.childOption(NioChannelOption.SO_KEEPALIVE, true);
        // IO模型
        serverBootstrap.channel(NioServerSocketChannel.class);

        // 业务处理
        serverBootstrap.handler(new ChannelInitializer<ServerSocketChannel>() {

            @Override
            protected void initChannel(ServerSocketChannel ch) throws Exception {

                System.out.println("服务channel init");
            }
        });
        serverBootstrap.childHandler(new ChannelInitializer<SocketChannel>() {
            @Override
            protected void initChannel(SocketChannel ch) throws Exception {
                System.out.println("SocketChannel init");
                ch.pipeline().addLast(new StringDecoder());
                ch.pipeline().addLast(new SimpleChannelInboundHandler<String>() {
                    @Override
                    protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
                        System.out.println("客户端:" + msg);
                    }
                });
            }
        });
        serverBootstrap.bind(8000);



    }
}
