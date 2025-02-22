package syc.learn.es;

import java.text.SimpleDateFormat;

/**
 * @author syc
 * @date 2024/1/23
 */
public class App {

    public static void main(String[] args) throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.parse("2024-01-23 08:00:00").getTime());
        System.out.println(simpleDateFormat.parse("2024-01-23 14:00:00").getTime());

    }
}
