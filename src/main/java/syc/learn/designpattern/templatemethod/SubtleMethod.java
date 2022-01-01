package syc.learn.designpattern.templatemethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author syc
 * @date 2020/9/8
 */
public class SubtleMethod extends StealingMethod {
    private static Logger logger = LoggerFactory.getLogger(SubtleMethod.class);

    @Override
    protected String pickTarget() {
        return "商店店主";
    }

    @Override
    protected void confuseTarget(String target) {
        logger.info("含着泪跑向{}，并抱着他", target);
    }

    @Override
    protected void stealItem(String target) {
        logger.info("在接近{}时，偷取他的钱包", target);
    }
}
