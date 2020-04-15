package syc.learn.designpattern.factory.factorymethod;

/**
 * @author yuchun.shao
 * @date 2020/4/15
 */
public class IPhoneXs implements Phone {
    @Override
    public void call(String number) {
        System.out.println("iPhoneXs call: " + number);
    }
}
