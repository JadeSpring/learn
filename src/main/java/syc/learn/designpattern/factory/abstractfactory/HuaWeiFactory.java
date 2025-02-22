package syc.learn.designpattern.factory.abstractfactory;

/**
 * @author yuchun.shao
 * @date 2020/4/14
 */
public class HuaWeiFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        return new HuaWeiPhone((HuaWeiLoudspeaker) createLoudspeaker(), (HuaWeiScreen) createScreen());
    }

    @Override
    public Loudspeaker createLoudspeaker() {
        return new HuaWeiLoudspeaker();
    }

    @Override
    public Screen createScreen() {
        return new HuaWeiScreen();
    }
}
