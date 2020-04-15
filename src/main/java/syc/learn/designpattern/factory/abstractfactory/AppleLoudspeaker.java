package syc.learn.designpattern.factory.abstractfactory;

/**
 * @author yuchun.shao
 * @date 2020/4/15
 */
public class AppleLoudspeaker implements Loudspeaker {
    @Override
    public void speak(String content) {
        System.out.println("AppleLoudspeaker speak: " + content);
    }
}
