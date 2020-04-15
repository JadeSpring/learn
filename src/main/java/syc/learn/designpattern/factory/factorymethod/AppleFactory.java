package syc.learn.designpattern.factory.factorymethod;

/**
 * @author yuchun.shao
 * @date 2020/4/14
 */
public class AppleFactory implements PhoneFactory {
    @Override
    public Phone createPhone(int year) {
        switch (year) {
            case 2019:
                return new IPhone11();
            case 2018:
                return new IPhoneXs();
            default:
                return new IPhoneX();
        }
    }
}
