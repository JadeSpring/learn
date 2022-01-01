package syc.learn.designpattern.prototype;

/**
 * @author syc
 * @date 2020/8/14
 */
public class CloneType implements Cloneable {
    private int a;
    private double b;
    private Prototype prototype;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Prototype getPrototype() {
        return prototype;
    }

    public void setPrototype(Prototype prototype) {
        this.prototype = prototype;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "CloneType{" +
                "a=" + a +
                ", b=" + b +
                ", prototype=" + prototype +
                '}';
    }
}
