package syc.learn.designpattern.factory;

import syc.learn.designpattern.factory.factorymethod.AppleFactory;
import syc.learn.designpattern.factory.factorymethod.HuaWeiFactory;
import syc.learn.designpattern.factory.factorymethod.Phone;
import syc.learn.designpattern.factory.factorymethod.PhoneFactory;

/**
 * @author yuchun.shao
 * @date 2020/4/14
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        getPhone(PhoneFactoryNameEnum.APPLE, 2019).call("13812345678");
        getPhone(PhoneFactoryNameEnum.APPLE, 2018).call("13812345678");
        getPhone(PhoneFactoryNameEnum.APPLE, 2017).call("13812345678");
        getPhone(PhoneFactoryNameEnum.HUA_WEI, 2019).call("13812345678");
        getPhone(PhoneFactoryNameEnum.HUA_WEI, 2018).call("13812345678");
        getPhone(PhoneFactoryNameEnum.HUA_WEI, 2017).call("13812345678");
    }

    private static Phone getPhone(PhoneFactoryNameEnum name, int year) {
        return FactoryMaker.getFactory(name).createPhone(year);
    }

    private static class FactoryMaker {
        static PhoneFactory getFactory(PhoneFactoryNameEnum name) {
            switch (name) {
                case APPLE:
                    return new AppleFactory();
                case HUA_WEI:
                default:
                    return new HuaWeiFactory();
            }
        }
    }

    private enum PhoneFactoryNameEnum {
        APPLE,
        HUA_WEI;
    }
}
