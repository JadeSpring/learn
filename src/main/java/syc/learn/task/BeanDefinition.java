package syc.learn.task;

import lombok.Data;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
@Data
public class BeanDefinition {
    private String name;
    private Class type;
    private List<Property> properties = new ArrayList<>();
    private List<Method> initMethodList = new ArrayList<>();
}
