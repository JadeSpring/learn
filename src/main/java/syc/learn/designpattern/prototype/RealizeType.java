package syc.learn.designpattern.prototype;

import lombok.Data;

/**
 * @author syc
 * @date 2020/8/14
 */
@Data
public class RealizeType implements Prototype {
    private int a;
    private double b;

    public RealizeType() {
    }

    public RealizeType(int a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Prototype clonePrototype() {
        RealizeType t = new RealizeType();
        t.a = this.a;
        t.b = this.b;
        return t;
    }
}
