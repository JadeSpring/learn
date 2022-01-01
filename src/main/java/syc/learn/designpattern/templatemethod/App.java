package syc.learn.designpattern.templatemethod;

/**
 * @author syc
 * @date 2020/9/8
 */
public class App {
    public static void main(String[] args) {
        Thief thief = new Thief(new HitAndRunMethod());
        thief.steal();
        thief.changeMethod(new SubtleMethod());
        thief.steal();
    }
}
