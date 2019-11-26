package syc.com.task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyBeanFactory  implements BeanRegister{
    private Map<String, Object> beanMap = new HashMap<>();
    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();
    private List<String> beanNameList = new ArrayList<>();

    public MyBeanFactory(String... basePackages) {
        ClassPathScanner scanner = new ClassPathScanner(this);
        scanner.scan(basePackages);
    }

    protected void refresh(){

    }

    @Override
    public void register(BeanDefinition bd) {
        beanDefinitionMap.put(bd.getName(), bd);
        beanNameList.add(bd.getName());
    }

    private Object doGetBean(String beanName){
        return null;
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
        return (T)beanMap.get(findBeanNameByType(type));
    }
}
