package syc.learn.designpattern.templatemethod;

/**
 * @author syc
 * @date 2020/9/8
 */
public abstract class StealingMethod {
    /**
     * 选择目标
     *
     * @return
     */
    protected abstract String pickTarget();

    /**
     * 迷惑目标
     *
     * @param target
     */
    protected abstract void confuseTarget(String target);

    /**
     * 偷取东西
     *
     * @param target
     */
    protected abstract void stealItem(String target);

    /**
     * 模版方法
     */
    public void steal() {
        String target = this.pickTarget();
        confuseTarget(target);
        stealItem(target);
    }
}
