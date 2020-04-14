package syc.learn.spring.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


/**
 * @author syc
 * @date 2020/2/19
 */
@Component
public class MyEventListener {



    @EventListener(classes = MyEvent.class)
    public void execute1(MyEvent event){
        System.out.println("执行MyEvent1" + event.getClass().getSimpleName());
    }

    @EventListener(classes = MySubEvent.class)
    public void execute2(MySubEvent event){
        System.out.println("执行MyEvent2" +event.getClass().getSimpleName());
    }
}
