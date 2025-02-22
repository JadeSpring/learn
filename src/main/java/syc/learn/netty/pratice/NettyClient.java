package syc.learn.netty.pratice;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.string.StringEncoder;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author syc
 * @date 2024/1/13
 */
public class NettyClient {
    public static void main(String[] args) {
        // bootstrap
        Bootstrap bootstrap = new Bootstrap();

        // 线程模型
        EventLoopGroup worker = new NioEventLoopGroup();

        bootstrap.group(worker);

        // IO模型
        bootstrap.channel(NioSocketChannel.class);

        // 业务处理
        bootstrap.handler(new ChannelInitializer<NioSocketChannel>() {
            @Override
            protected void initChannel(NioSocketChannel ch) throws Exception {
                System.out.println("客户端 init");
                // 输出要加encoder
                ch.pipeline().addLast(new StringEncoder());
            }
        });

        // 怎么设置超时时间? 以及超时场景如何处理？
        bootstrap.option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 1);
        bootstrap.option(ChannelOption.SO_KEEPALIVE, true);
        bootstrap.option(ChannelOption.TCP_NODELAY, true);

        // 连接future，通过listener来处理连接的结果
        ChannelFuture channelFuture = bootstrap.connect("127.0.01", 8000);
        channelFuture.addListener(x -> {
            if (x.isSuccess()) {
                System.out.println("连接成功");
                while (true) {
                    channelFuture.channel().writeAndFlush(new Date() + "你好啊");
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                System.out.println("连接失败: " + x.cause());
            }
        });
    }
}
