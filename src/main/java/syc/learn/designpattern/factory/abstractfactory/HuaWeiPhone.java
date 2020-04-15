package syc.learn.designpattern.factory.abstractfactory;

/**
 * @author yuchun.shao
 * @date 2020/4/15
 */
public class IPhone implements Phone {
    private AppleLoudspeaker loudspeaker;

    private AppleScreen screen;

    public IPhone(AppleLoudspeaker loudspeaker, AppleScreen screen) {
        this.loudspeaker = loudspeaker;
        this.screen = screen;
    }

    @Override
    public void speak(String content) {
        loudspeaker.speak(content);
    }

    @Override
    public void watchTv() {
        screen.show();
    }
}
