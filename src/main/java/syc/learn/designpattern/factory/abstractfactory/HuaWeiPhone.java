package syc.learn.designpattern.factory.abstractfactory;

/**
 * @author yuchun.shao
 * @date 2020/4/14
 */
public class HuaWeiPhone implements Phone {
    private HuaWeiLoudspeaker loudspeaker;

    private HuaWeiScreen screen;

    public HuaWeiPhone(HuaWeiLoudspeaker loudspeaker, HuaWeiScreen screen) {
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
