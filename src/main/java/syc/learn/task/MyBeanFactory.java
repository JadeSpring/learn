package syc.learn.task;

import syc.learn.spring.domain.SomeBean;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

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

    private Object doGetBean(String beanName) throws Exception {
        Object bean = beanMap.get(beanName);
        if (bean != null) {
            return bean;
        }

        BeanDefinition bd = beanDefinitionMap.get(beanName);
        return createBean(bd);
    }

    private Object createBean(BeanDefinition bd) throws Exception {
        Object bean = instantiateBean(bd);
        beanMap.put(bd.getName(), bean);
        dependencyInject(bean, bd);
        bean = invokeInitMethod(bean, bd);
        return bean;
    }

    private void dependencyInject(Object bean, BeanDefinition bd) throws Exception {
        List<Property> properties = bd.getProperties();
        for (Property p : properties) {
            String proBeanName = findBeanNameByType(p.getType());
            Object propBean = doGetBean(proBeanName);
            Field propField = bd.getType().getDeclaredField(p.getName());
            propField.setAccessible(true);
            propField.set(bean, propBean);
        }
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

    private Object invokeInitMethod(Object bean, BeanDefinition bd) throws Exception {
        bean = postProcessBeforeInitMethod(bean, bd.getName());
        if (bean == null) {
            return null;
        }
        doInit(bean, bd.getInitMethodList());
        bean = postProcessAfterInitMethod(bean, bd.getName());
        return bean;
    }

    private void doInit(Object bean, List<Method> initMethodList) throws Exception {
        Objects.requireNonNull(bean, "doInit方法入参bean不能为null");
        Objects.requireNonNull(initMethodList, "doInit方法入参initMethodList不能为null");

        for (Method method : initMethodList) {
            method.invoke(bean);
        }
    }

    private Object postProcessBeforeInitMethod(Object bean, String beanName) {
        Objects.requireNonNull(bean, "postProcessBeforeInitMethod方法入参bean不能为null");
        Objects.requireNonNull(beanName, "postProcessBeforeInitMethod方法入参beanName不能为null");

        for (MyBeanPostProcessor processor : beanPostProcessorList) {
            bean = processor.beforeInit(bean, beanName);
            if (bean == null) {
                return null;
            }
        }

        return bean;
    }

    private Object postProcessAfterInitMethod(Object bean, String beanName) {
        Objects.requireNonNull(bean, "postProcessAfterInitMethod方法入参bean不能为null");
        Objects.requireNonNull(beanName, "postProcessAfterInitMethod方法入参beanName不能为null");

        for (MyBeanPostProcessor processor : beanPostProcessorList) {
            bean = processor.afterInit(bean, beanName);
            if (bean == null) {
                return null;
            }
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

    public static void main(String[] args) {
        Map<String, SomeBean> map =new HashMap<>();
        SomeBean bean = new SomeBean();
        bean.setB(2);
        bean.setA(1);

        map.put("someBean", bean);
        bean = new SomeBean();
        bean.setA(3);
        bean.setB(4);

        SomeBean someBean = map.get("someBean");
        System.out.println(someBean == bean);
        System.out.println(someBean);
        System.out.println(bean);

    }
}
