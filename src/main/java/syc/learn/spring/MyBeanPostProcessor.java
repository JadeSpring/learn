package syc.learn.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        if (beanName.endsWith("Bean"))
        if (bean instanceof SomeBean) {
            SomeBean sb = (SomeBean)bean;
            sb.setB(2);
        }

        if (bean instanceof MyBeanPostProcessor) {
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println(bean);
            System.out.println(this);
            System.out.println(bean == this);
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
        }
            System.out.println(beanName + " postProcessBeforeInitialization" + this);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        if (beanName.endsWith("Bean"))
            System.out.println(beanName + " postProcessAfterInitialization");
        return bean;
    }

//    @Override
//    public int getOrder() {
//        return 3;
//    }
}
