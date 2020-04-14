package syc.learn.designpattern.singleton;

/**
 * @author syc
 * @date 2020/4/13
 */
public class SimpleSingleton {
    private static final SimpleSingleton instance = new SimpleSingleton();
    private static boolean flag = true;
    private SimpleSingleton(){
        if (flag) {
            flag = false;
        } else {
            throw new IllegalStateException("已经初始化");
        }
    }

    public static SimpleSingleton getInstance() {
        return instance;
    }
}
