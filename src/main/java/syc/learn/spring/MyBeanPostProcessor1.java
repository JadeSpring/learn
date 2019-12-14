package syc.learn.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor1 implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        if (beanName.endsWith("Bean"))

        if (beanName.equals("someBean")){
//            return null;
        }

        if (bean instanceof SomeBean) {
            SomeBean sb = (SomeBean)bean;
            sb.setA(1);
        }
            System.out.println(beanName + " MyBeanPostProcessor1#postProcessBeforeInitialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("someBean")){
//            return null;
        }
            System.out.println(beanName + "  MyBeanPostProcessor1#postProcessAfterInitialization");
        return bean;
    }

//    @Override
//    public int getOrder() {
//        return 2;
//    }
}
