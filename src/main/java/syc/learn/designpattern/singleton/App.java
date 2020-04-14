package syc.learn.designpattern.singleton;

import java.lang.reflect.Constructor;

/**
 * @author syc
 * @date 2020/4/13
 */
public class App {
    public static void main(String[] args) throws Exception{
        testSimpleSingleton();
    }

    private static void testSimpleSingleton() throws Exception {
        SimpleSingleton simpleSingleton = SimpleSingleton.getInstance();

//        SimpleSingleton simpleSingleton1 = SimpleSingleton.class.newInstance();
        Constructor<SimpleSingleton> constructor = SimpleSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SimpleSingleton simpleSingleton1 = constructor.newInstance();
        System.out.println(simpleSingleton1 == simpleSingleton);
    }
}
