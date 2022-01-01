package syc.learn.designpattern.prototype;

/**
 * @author syc
 * @date 2020/8/14
 */
public class PrototypeTest {
    public static void main(String[] args) throws Exception{
        Prototype prototype = new RealizeType(1, 2.1);
        Prototype clone = prototype.clonePrototype();

        System.out.println(prototype);
        System.out.println(clone);

        CloneType c1 = new CloneType();
        c1.setA(1);
        c1.setB(2.1);
        c1.setPrototype(prototype);

        System.out.println(c1);

        CloneType c2 = (CloneType) c1.clone();

        System.out.println(c2);

        ((RealizeType)c1.getPrototype()).setA(10);
        c1.setA(11);

        System.out.println(c1);
        System.out.println(c2);

    }
}
