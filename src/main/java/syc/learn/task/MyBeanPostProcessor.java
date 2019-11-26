package syc.learn.task;

public interface MyBeanPostProcessor {
    Object beforeInit(Object bean, String name);
    Object afterInit(Object bean, String name);
}
