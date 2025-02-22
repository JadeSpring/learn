package syc.learn.jvm.classloading;

/**
 * @author yuchun.shao
 * @date 2020/4/17
 */
public class SuperClass {
    public static final String HELLO = "hello";
    public static String WORLD = "world";
    static {
        System.out.println("SupperClass init");
    }
}
