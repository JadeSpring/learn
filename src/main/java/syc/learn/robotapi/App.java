package syc.learn.robotapi;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author sycø
 * @date 2023/1/10
 */
public class App {
    static {
        init();
    }

    private static ThreadPoolTaskExecutor threadPoolTaskExecutor;

    private static void init() {
        threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setCorePoolSize(5);
        threadPoolTaskExecutor.setKeepAliveSeconds(200);
        threadPoolTaskExecutor.setMaxPoolSize(500);
        threadPoolTaskExecutor.setQueueCapacity(50);
        threadPoolTaskExecutor.setThreadNamePrefix("livechat-core-");
        threadPoolTaskExecutor.initialize();
    }

    public static void main(String[] args) {
        String url = "http://localhost:8080/livechatrobot/api/throttle/test";
        int num = 1;
        Map<Object, AtomicInteger> map = new ConcurrentHashMap<>();
        map.put(true, new AtomicInteger());
        map.put(false, new AtomicInteger());
        List<Future<?>> list = new ArrayList<>();
        RestTemplate restTemplate = new RestTemplate();


        long start = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            try {
                Future<?> future = threadPoolTaskExecutor.submit(() -> {
                    try {
                        restTemplate.getForObject(url, String.class);
                        map.get(true).incrementAndGet();
                    } catch (Exception e) {
                        map.get(false).incrementAndGet();
                        AtomicInteger atomicInteger = map.getOrDefault(e.getMessage(), new AtomicInteger());
                        atomicInteger.incrementAndGet();
                        map.put(e.getMessage(), atomicInteger);
                    }
                });
                list.add(future);
                if (i % 20 == 0) {
                    TimeUnit.SECONDS.sleep(1);
                }
            } catch (Exception e) {
                System.out.println("加入线程池异常:" + e.getMessage());
            }
        }

        for (Future<?> future : list) {
            try {
                future.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        long es = System.currentTimeMillis() - start;

        threadPoolTaskExecutor.shutdown();

        System.out.println(map);
        System.out.println("耗时：" + es);
    }
}
