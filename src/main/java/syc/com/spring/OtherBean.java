package syc.com.spring;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Data
public class OtherBean {
    @Autowired
    private SomeBean someBean;

    public OtherBean() {
        System.out.println("========= OtherBean#Construct =========");
    }

    @PostConstruct
    public void init(){
        System.out.println(someBean);
        System.out.println("========= OtherBean#init =========");
    }
}
