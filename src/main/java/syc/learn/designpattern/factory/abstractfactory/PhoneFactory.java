package syc.learn.designpattern.factory.abstractfactory;

/**
 * @author yuchun.shao
 * @date 2020/4/14
 */
public interface PhoneFactory {
    Phone createPhone();
    Loudspeaker createLoudspeaker();
    Screen createScreen();
}
