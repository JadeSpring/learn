package syc.learn.task;

import org.apache.commons.lang3.StringUtils;

import java.util.HashSet;
import java.util.Set;

public class ClassPathScanner {
    private BeanRegister beanRegister;

    public ClassPathScanner(BeanRegister beanRegister) {
        this.beanRegister = beanRegister;
    }

    public void scan(String... basePackages) {
        Set<Class> classSet = doScan(basePackages);
        for (Class clz : classSet) {
            BeanDefinition bd = new BeanDefinition();
            Compenent compenent = (Compenent) clz.getAnnotation(Compenent.class);
            if (StringUtils.isNotBlank(compenent.value())) {
                bd.setName(compenent.value());
            } else {
                bd.setName("");
            }

            bd.setType(clz);
            beanRegister.register(bd);
        }


    }

    private Set<Class> doScan(String... basePackages) {
        return new HashSet<>();
    }

}
