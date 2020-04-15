package syc.learn.designpattern.factory.abstractfactory;

/**
 * @author yuchun.shao
 * @date 2020/4/14
 */
public class HuaWeiLoudspeaker implements Loudspeaker {
    @Override
    public void speak(String content) {
        System.out.println("HuaWeiLoudspeaker speak: " + content);
    }
}
