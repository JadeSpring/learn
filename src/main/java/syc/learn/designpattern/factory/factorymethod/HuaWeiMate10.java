package syc.learn.designpattern.factory.factorymethod;

/**
 * @author yuchun.shao
 * @date 2020/4/14
 */
public class HuaWeiMate10 implements Phone {
    @Override
    public void call(String number) {
        System.out.println("HuaWeiMate10 call: " + number);
    }
}
