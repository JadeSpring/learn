package syc.com.task;

public interface MyBeanPostProcessor {
    Object beforeInit(Object bean, String name);
    Object afterInit(Object bean, String name);
}
