package syc.learn.java.concurrent;

import java.security.SecureRandom;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author syc
 * @date 2024/4/19
 */
public class App {
    public static void main(String[] args) {
        ConcurrentMap<Long, Long> sendMessagesTimestamp = new ConcurrentHashMap<>();
        AtomicInteger count2 = new AtomicInteger();
        Random random = new SecureRandom();
        new Thread(() -> {
            while (true) {
                long l = System.currentTimeMillis();
                System.out.println("produce :" + l);
                sendMessagesTimestamp.put(l, l);
                try {
                    TimeUnit.MILLISECONDS.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                int i = count2.incrementAndGet();
                long now = System.currentTimeMillis();
                Set<Map.Entry<Long, Long>> entries = sendMessagesTimestamp.entrySet();
                int size = entries.size();

                System.out.println("con size before" + size);
                for (Map.Entry<Long, Long> entry : entries) {
                    if (now > entry.getKey()) {
                        System.out.println(i + " consume: " + entry.getKey());
                    } else {
                        System.err.println(i + " consume: " + entry.getKey());
                    }
                    int r = random.nextInt(2);
                    if (r % 2 == 0) {
                        System.out.println(i + ": r" + r + " remove: " + entry.getKey());
                        sendMessagesTimestamp.remove(entry.getKey());
                    }
                    try {
                        TimeUnit.MILLISECONDS.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                int afterSize = entries.size();
                System.out.println("con size after" + afterSize);
                int mapSize = sendMessagesTimestamp.size();
                if (mapSize == afterSize) {
                    System.out.println("sendMessagesTimestamp.size()" + mapSize);
                } else {
                    System.err.println("sendMessagesTimestamp.size()" + mapSize);
                }

                System.out.println("======" + i + "====");
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();
    }
}
