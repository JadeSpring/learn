package syc.learn.spring;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class OtherBean {

    private SomeBean someBean;

    public OtherBean() {
        System.out.println("========= OtherBean#Construct =========");
    }

    @PostConstruct
    public void init(){
        System.out.println(someBean);
        System.out.println("========= OtherBean#init =========");
    }

    public void print(){
        System.out.println(someBean);
    }

    @Autowired
    public void setSomeBean(SomeBean someBean) {
        this.someBean = someBean;
    }
}
