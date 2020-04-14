package syc.learn.designpattern.singleton;

/**
 * @author syc
 * @date 2020/4/13
 */
public class InstanceHolderSingleton {
    private static boolean flag = true;

    private InstanceHolderSingleton() {
        if (flag) {
            flag = false;
        } else {
            throw new IllegalStateException("已经初始化");
        }
    }

    public InstanceHolderSingleton getInstance() {
        return InstanceHolder.instance;
    }

    private static class InstanceHolder {
        private static final InstanceHolderSingleton instance = new InstanceHolderSingleton();
    }
}
