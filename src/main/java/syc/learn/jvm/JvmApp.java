package syc.learn.jvm;

import java.util.ArrayList;
import java.util.List;

public class JvmApp {
    public static void main(String[] args) {
        System.out.println("hello jvm");
        List<Item> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(new Item());
            System.out.println("hello "  + i);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static class Item {
        private byte[] bytes;

        public Item() {
            this.bytes = new byte[1024*1024];
        }
    }
}
