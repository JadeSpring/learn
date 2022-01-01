package syc.learn.designpattern.templatemethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author syc
 * @date 2020/9/8
 */
public class HitAndRunMethod extends StealingMethod {
    private static Logger logger = LoggerFactory.getLogger(HitAndRunMethod.class);
    @Override
    protected String pickTarget() {
        return "老人";
    }

    @Override
    protected void confuseTarget(String target) {
        logger.info("快速接近{}", target);
    }

    @Override
    protected void stealItem(String target) {
        logger.info("用力抢夺{}的包，然后快速逃离", target);
    }
}
