package syc.learn.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
