package syc.learn.spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class SomeBean {
    public SomeBean() {
        System.out.println("************ Construct ***********");
    }

    @PostConstruct
    public void init(){
        System.out.println("*********** init *************");
    }
}
