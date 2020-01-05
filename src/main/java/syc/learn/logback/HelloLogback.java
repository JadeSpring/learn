package syc.learn.logback;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloLogback {
    public static void main(String[] args) {
//        helloLog();
//        selectionRule();
//        parameterLog();
        testAdditivity();
    }

    private static void helloLog() {
        // 获取logger实例
        Logger logger = LoggerFactory.getLogger(HelloLogback.class);
        logger.debug("hello logback");

        // 获取logger上下文
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        // 输出logger内部状态
        StatusPrinter.print(lc);
    }

    /**
     * 日志等级继承规则
     * 对于一个给定的名为 L 的 logger，它的有效层级为从自身一直回溯到 root logger，直到找到第一个不为空的层级作为自己的层级。
     * root logger 会有一个默认层级 --- DEBUG
     * <p>
     * 日志输出规则
     * 日志的打印级别为 p，Logger 实例的级别为 q，如果 p >= q，则该条日志可以打印出来。
     * 各级别的排序为：TRACE < DEBUG < INFO < WARN < ERROR
     * <p>
     * 日志实例的等级为info，INFO 、 WARN 、ERROR 会输出，TRACE 、 DEBUG 不输出
     */
    private static void selectionRule() {
        ch.qos.logback.classic.Logger parentLogger = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("syc.learn");
//        parentLogger.setLevel(Level.INFO);

        parentLogger.trace("trace parent");
        parentLogger.debug("debug parent");
        parentLogger.info("info parent");
        parentLogger.warn("warn parent");
        parentLogger.error("error parent");

        // 继承parentLogger的级别
        Logger childLogger = LoggerFactory.getLogger("syc.learn.logback");
        childLogger.trace("trace child");
        childLogger.debug("debug child");
        childLogger.info("info child");
        childLogger.warn("warn child");
        childLogger.error("error child");

        // 同一个名称获取的日志实例为同一个
        Logger anotherLogger = LoggerFactory.getLogger("syc.learn.logback");
        System.out.println(childLogger == anotherLogger);
    }

    /**
     * 参数化日志
     */
    private static void parameterLog() {
        ch.qos.logback.classic.Logger logger = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("syc.learn");
        logger.setLevel(Level.INFO);

        String msg = "debug msg";
        // 直接拼接字符串，不管是否记录该日志，都会有构建字符串的消耗
        logger.debug("hello debug msg " + msg);

        //使用日志等级判断，来决定是否构建字符串，比上一种方式，在不需要记录debug日志，减少消耗
        if (logger.isDebugEnabled()) {
            logger.debug("hello debug " + msg);
        }

        //最佳实践，使用{}格式化占位符，由log底层构建记录消息。减少消耗，提升程序可读性
        logger.debug("hello debug parameter {}", msg);
    }

    /**
     * appender 的叠加性
     * <p>
     * logger L 的日志输出语句会遍历 L 和它的子级中所有的 appender。
     * 这就是所谓的 appender 叠加性（appender additivity）
     * <p>
     * 如果 L 的子级 logger 为 P，且 P 设置了 additivity = false，
     * 那么 L 的日志会在 L 所有 的 appender 包括 P 本身的 appender 中输出，
     * 但是不会在 P 的子级 appender 中输出。
     * <p>
     * logger 默认设置 additivity = true。
     */
    private static void testAdditivity() {
        // logger会默认使用父logger的appender和自己添加的appender输出日志
        Logger parentLogger =  LoggerFactory.getLogger("a");
        doLog(parentLogger, "a");

        // logger 设置additivity=false后，appender不会使用父logger的appender
        Logger logger = LoggerFactory.getLogger("a.b");
        doLog(logger, "a.b");

    }

    private static void doLog(Logger logger, String msg) {
        logger.trace(msg);
        logger.debug(msg);
        logger.info(msg);
        logger.warn(msg);
        logger.error(msg);
    }
}
