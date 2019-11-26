package syc.com.task;

public interface MyInstantiateBeanPostProcessor extends MyBeanPostProcessor {
    Object beforeInstantiation(Class<?> beanClass, String beanName);

    boolean afterInstantiation(Object bean, String beanName);
}
