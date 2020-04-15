package syc.learn.designpattern.factory.factorymethod;

/**
 * @author yuchun.shao
 * @date 2020/4/15
 */
public class IPhoneX implements Phone {
    @Override
    public void call(String number) {
        System.out.println("iPhoneX call: " + number);
    }
}
