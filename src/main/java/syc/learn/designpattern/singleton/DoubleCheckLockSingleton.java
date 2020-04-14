package syc.learn.designpattern.singleton;

/**
 * @author syc
 * @date 2020/4/13
 */
public class DoubleCheckLockSingleton {
    private static DoubleCheckLockSingleton instance;
    private static boolean flag = true;
    private DoubleCheckLockSingleton(){
        if (flag) {
            flag = false;
        } else {
            throw new IllegalStateException("已经初始化");
        }
    }

    public static DoubleCheckLockSingleton getInstance() {
        DoubleCheckLockSingleton result = instance;

        if (result == null) {
            synchronized (DoubleCheckLockSingleton.class) {
                result = instance;
                if (result == null) {
                    instance = new DoubleCheckLockSingleton();
                    result = instance;
                }
            }
        }

        return result;
    }
}
