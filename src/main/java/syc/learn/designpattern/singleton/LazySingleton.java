package syc.learn.designpattern.singleton;

/**
 * @author syc
 * @date 2020/4/13
 */
public class LazySingleton {
    private static LazySingleton instance;
    private static boolean flag = true;

    private LazySingleton(){
        if (flag) {
            flag = false;
        } else {
            throw new IllegalStateException("已经初始化");
        }
    }


    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }

        return instance;
    }
}
