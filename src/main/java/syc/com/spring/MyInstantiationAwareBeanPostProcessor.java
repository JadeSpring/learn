package syc.com.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.beans.PropertyDescriptor;

@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
//        if (beanName.endsWith("Bean"))
            System.out.println(beanName + " MyInstantiationAwareBeanPostProcessor#postProcessBeforeInstantiation");
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
//        if (beanName.endsWith("Bean"))
            System.out.println(beanName + " MyInstantiationAwareBeanPostProcessor#postProcessAfterInstantiation");
        return false;
    }

    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
//        if (beanName.endsWith("Bean"))
            System.out.println(beanName + " MyInstantiationAwareBeanPostProcessor#postProcessPropertyValues");
        return pvs;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        if (beanName.endsWith("Bean"))
            System.out.println(beanName + " MyInstantiationAwareBeanPostProcessor#postProcessBeforeInitialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        if (beanName.endsWith("Bean"))
            System.out.println(beanName + " MyInstantiationAwareBeanPostProcessor#postProcessAfterInitialization");
        return bean;
    }
}
