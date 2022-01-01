package syc.learn.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import syc.learn.spring.domain.OtherBean;
import syc.learn.spring.domain.SomeBean;
import syc.learn.spring.processor.MyBeanPostProcessor;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        SomeBean bean = ac.getBean(SomeBean.class);
        System.out.println(bean);
        OtherBean otherBean = ac.getBean(OtherBean.class);
        System.out.println(otherBean);
        otherBean.print();

        System.out.println(ac.getBean(MyBeanPostProcessor.class));
    }
}
