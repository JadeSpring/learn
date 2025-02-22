package syc.learn.java;

import org.apache.commons.lang3.StringUtils;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;

public class ThreadPoolUtil {

    public static final String POOL_KNOWLEDGE = "Live-Knowledge";

    public static final String POOL_BUSINESS = "Live-Business";

    public static final String POOL_OPEN_PLATFORM = "Live-OpenPlatform";

    private static ConcurrentHashMap<String, ThreadPoolTaskExecutor> poolMap = new ConcurrentHashMap<>();

    static {
        init();
        initKnowledge();
        initOpenPlatform();
    }

    private static ThreadPoolTaskExecutor threadPoolTaskExecutor;

    private static ThreadPoolTaskExecutor threadPoolTaskKnowledge;

    /**
     * 开放平台线程池
     */
    private static ThreadPoolTaskExecutor threadPoolTaskOpenPlatform;

    private static void init() {
        threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setCorePoolSize(5);
        threadPoolTaskExecutor.setKeepAliveSeconds(200);
        threadPoolTaskExecutor.setMaxPoolSize(50);
        threadPoolTaskExecutor.setQueueCapacity(20000);
        threadPoolTaskExecutor.setThreadNamePrefix("livechat-customer-");
        threadPoolTaskExecutor.initialize();
        poolMap.put(ThreadPoolUtil.POOL_BUSINESS, threadPoolTaskExecutor);
    }

    private static void initKnowledge() {
        threadPoolTaskKnowledge = new ThreadPoolTaskExecutor();
        threadPoolTaskKnowledge.setCorePoolSize(10);
        threadPoolTaskKnowledge.setKeepAliveSeconds(200);
        threadPoolTaskKnowledge.setMaxPoolSize(50);
        threadPoolTaskKnowledge.setQueueCapacity(50);
        threadPoolTaskKnowledge.setThreadNamePrefix("livechat-customer-knowledge-");
        threadPoolTaskKnowledge.initialize();
        poolMap.put(ThreadPoolUtil.POOL_KNOWLEDGE, threadPoolTaskKnowledge);
    }

    private static void initOpenPlatform() {
        threadPoolTaskOpenPlatform = new ThreadPoolTaskExecutor();
        threadPoolTaskOpenPlatform.setCorePoolSize(10);
        threadPoolTaskOpenPlatform.setKeepAliveSeconds(200);
        threadPoolTaskOpenPlatform.setMaxPoolSize(50);
        threadPoolTaskOpenPlatform.setQueueCapacity(50);
        threadPoolTaskOpenPlatform.setThreadNamePrefix("livechat-customer-open-platform-");
        threadPoolTaskOpenPlatform.initialize();
        poolMap.put(ThreadPoolUtil.POOL_OPEN_PLATFORM, threadPoolTaskOpenPlatform);
    }

    public static ThreadPoolTaskExecutor get(String poolName) {
        ThreadPoolTaskExecutor executor = null;
        if (StringUtils.isNotBlank(poolName)) {
            if (poolMap.containsKey(poolName)) {
                executor = poolMap.get(poolName);
            }
        }
        if (executor == null) {
            executor = threadPoolTaskExecutor;
        }
        return executor;
    }


    public static Future<?> addTask(Runnable task) {
        return get(POOL_BUSINESS).submit(task);
    }

    public static <V> Future<V> addTask(Callable<V> task) {
        return get(POOL_BUSINESS).submit(task);
    }

    public static void execute(Runnable task) {
        get(POOL_BUSINESS).execute(task);
    }

    public static void executeKnowledge(Runnable task) {
        get(POOL_KNOWLEDGE).execute(task);
    }

    public static void executeOpenPlat(Runnable task) {
        get(POOL_OPEN_PLATFORM).execute(task);
    }

}
