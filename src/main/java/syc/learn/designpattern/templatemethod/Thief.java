package syc.learn.designpattern.templatemethod;

/**
 * @author syc
 * @date 2020/9/8
 */
public class Thief {
    private StealingMethod method;

    public Thief(StealingMethod method) {
        this.method = method;
    }

    public void changeMethod(StealingMethod method) {
        this.method = method;
    }

    public void steal() {
        method.steal();
    }
}
