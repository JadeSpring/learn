package syc.learn.java.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author syc
 * @date 2021/2/17
 */
public class ExecutorServiceApp {
    public static void main(String[] args) {
        testFixedPool();
    }

    private static void testFixedPool() {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 100; i++) {
            executorService.submit(new Worker("worker" + i, 1000, System.currentTimeMillis()));
        }
    }

    public static class Worker implements Runnable {
        private String name;
        private int runningTime;
        private long startTime;

        public Worker(String name, int runningTime) {
            this.name = name;
            this.runningTime = runningTime;
        }

        public Worker(String name, int runningTime, long startTime) {
            this.name = name;
            this.runningTime = runningTime;
            this.startTime = startTime;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(runningTime);
                System.out.println(name + " done, 耗时: " + (System.currentTimeMillis() - startTime) + " startTime: " + startTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
