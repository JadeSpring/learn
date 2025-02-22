package syc.learn.json;

import com.alibaba.fastjson2.JSON;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author syc
 * @date 2024/3/6
 */
public class FastTestApp {
    public static void main(String[] args) {
        A a = new A();
        a.setTest("hhh");
        System.out.println(JSON.toJSONString(a));
        Field[] declaredFields = A.class.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            Annotation[] annotations = declaredField.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println(annotation);
            }
        }

        List<SelectValue> list = new ArrayList<>();
        list.add(new SelectValue("1", "2", TimeUnit.HOURS));
        list.add(new SelectValue("1", "3", TimeUnit.MINUTES));
        System.out.println(JSON.toJSONString(list));
    }

    @Data
    public static class A {

        @JsonProperty("TestJack")
        @SerializedName("TestGson")
        private String test;

    }
}
