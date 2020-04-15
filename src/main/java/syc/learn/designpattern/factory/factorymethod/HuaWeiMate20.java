package syc.learn.designpattern.factory.factorymethod;

/**
 * @author yuchun.shao
 * @date 2020/4/14
 */
public class HuaWeiMate20 implements Phone {
    @Override
    public void call(String number) {
        System.out.println("HuaWeiMate20 call: " + number);
    }
}
