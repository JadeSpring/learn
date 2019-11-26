package syc.com.task;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class BeanDefinition {
    private String name;
    private Class type;
    private List<Property> properties = new ArrayList<>();
}
