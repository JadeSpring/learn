package syc.learn.designpattern.factory.abstractfactory;

/**
 * @author yuchun.shao
 * @date 2020/4/14
 */
public class AppleFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        return new IPhone((AppleLoudspeaker) createLoudspeaker(), (AppleScreen) createScreen());
    }

    @Override
    public Loudspeaker createLoudspeaker() {
        return new AppleLoudspeaker();
    }

    @Override
    public Screen createScreen() {
        return new AppleScreen();
    }
}
