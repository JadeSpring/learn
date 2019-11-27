package syc.learn.spring;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Data
public class SomeBean {
    private int a;
    private int b;

    public SomeBean() {
        System.out.println("************ Construct ***********");
    }

    @PostConstruct
    public void init(){
        System.out.println(this);
        System.out.println("*********** init *************");
    }
}
