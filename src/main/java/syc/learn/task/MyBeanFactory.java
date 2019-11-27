package syc.learn.task;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyBeanFactory implements BeanRegister {
    private Map<String, Object> beanMap = new HashMap<>();
    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();
    private List<String> beanNameList = new ArrayList<>();

    private List<MyInstantiateBeanPostProcessor> instantiateBeanPostProcessorList = new ArrayList<>();
    private List<MyBeanPostProcessor> beanPostProcessorList = new ArrayList<>();

    public MyBeanFactory(String... basePackages) {
        ClassPathScanner scanner = new ClassPathScanner(this);
        scanner.scan(basePackages);
    }

    protected void refresh() {

    }

    @Override
    public void register(BeanDefinition bd) {
        beanDefinitionMap.put(bd.getName(), bd);
        beanNameList.add(bd.getName());
    }

    private Object doGetBean(String beanName) {
        return null;
    }

    private Object createBean(BeanDefinition bd) {

        return null;
    }

    private Object instantiateBean(BeanDefinition bd) throws Exception {
        Object o = this.postProcessBeforeInstantiation(bd);
        if (o != null) {
            return o;
        }
        return bd.getType().newInstance();
    }

    private Object postProcessBeforeInstantiation(BeanDefinition bd) {
        for (MyInstantiateBeanPostProcessor processor : instantiateBeanPostProcessorList) {
            Object o = processor.beforeInstantiation(bd.getType(), bd.getName());
            if (o != null) {
                return o;
            }
        }
        return null;
    }

    private Object invokeInitMethod(Object bean, BeanDefinition bd) throws Exception{
        for (MyBeanPostProcessor processor : beanPostProcessorList) {
            bean = processor.beforeInit(bean, bd.getName());
            for (Method method : bd.getInitMethodList()) {
                method.invoke(bean);
            }
            bean = processor.afterInit(bean, bd.getName());
        }
        return bean;
    }

    private Object postProcessBeforeInitMethod(Object bean, String beanName){
        for (MyBeanPostProcessor processor : beanPostProcessorList) {
            bean = processor.beforeInit(bean, beanName);
        }

        return bean;
    }

    private String findBeanNameByType(Class<?> type) {
        List<String> foundList = new ArrayList<>();
        for (String beanName : beanNameList) {
            BeanDefinition bd = beanDefinitionMap.get(beanName);
            if (type.isAssignableFrom(bd.getType())) {
                foundList.add(bd.getName());
            }
        }

        if (foundList.size() == 1) {
            return foundList.get(0);
        } else if (foundList.size() > 1) {
            throw new RuntimeException("有多个" + type.getName() + "类型的bean");
        } else {
            throw new RuntimeException("没有" + type.getName() + "类型的bean");
        }
    }

    public Object getBean(String beanName) {
        return beanMap.get(beanName);
    }

    @SuppressWarnings("unchecked")
    public <T> T getBean(Class<T> type) {
        return (T) beanMap.get(findBeanNameByType(type));
    }
}
