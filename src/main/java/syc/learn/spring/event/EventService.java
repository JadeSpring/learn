package syc.learn.spring.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author syc
 * @date 2020/2/19
 */
@Component
public class EventService {

    @Autowired
    private EventPublisher eventPublisher;

    public void execute(){
        System.out.println("before event");
        eventPublisher.publishEvent(new MyEvent());
        eventPublisher.publishEvent(new MySubEvent());
        System.out.println("after event");
        System.out.println();
    }
}
