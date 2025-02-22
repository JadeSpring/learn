package syc.learn.designpattern.factory.factorymethod;

/**
 * @author yuchun.shao
 * @date 2020/4/14
 */
public class HuaWeiFactory implements PhoneFactory {
    @Override
    public Phone createPhone(int year) {
        switch (year) {
            case 2019:
                return new HuaWeiP30();
            case 2018:
                return new HuaWeiMate20();
            default:
                return new HuaWeiMate10();
        }
    }
}
