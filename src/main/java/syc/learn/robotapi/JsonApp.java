package syc.learn.robotapi;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author syc
 * @date 2023/4/3
 */
public class JsonApp {
    public static void main(String[] args) throws Exception {
        A a = new A();
        a.aa = "123";
        a.bb = 12;
        a.b = new B();
        a.b.b = "bbb";
        a.cs = new ArrayList<>();
        a.cs.add(new C());
        a.cs.get(0).c = 1.2;

        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> map = JSON.parseObject(objectMapper.writeValueAsString(a), Map.class);
//        Map<String, Object> map = objectMapper.readValue(objectMapper.writeValueAsString(a), Map.class);
        System.out.println(objectMapper.writeValueAsString(map));
        Map<String, String> m1 = new HashMap<>();
        map.forEach((k,v) -> {

            try {
                String vv = "";
                if (v == null) {
                    return;
                }

                if (v instanceof String) {
                    vv = (String)v;
                }else {
                    vv = objectMapper.writeValueAsString(v);
                }
                m1.put(k, vv);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        });
        Map<String, String> m2 = new HashMap<>();
        map.forEach((k,v) -> {

            String vv = String.valueOf(v);
            m2.put(k, vv);
        });

        System.out.println("******************************");

        test(m1);

        System.out.println("******************************");

        test(m2);
    }

    private static void test(Map<String, String> m1) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            System.out.println(objectMapper.writeValueAsString(m1));
            List cs = objectMapper.readValue(m1.get("cs"), List.class);
            System.out.println(cs);
            Map b_map = objectMapper.readValue(m1.get("b"), Map.class);
            System.out.println(b_map);
            System.out.println(m1.get("aa"));
            System.out.println(m1.get("bb"));
            System.out.println(m1.get("bool"));
            System.out.println(m1.get("bool2"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Data
    public static class A {
      private String aa;
      private int bb;
      private B b;
      private List<C> cs;
      private boolean bool;
      private Boolean bool2;
    }

    @Data
    public static class B {
        private String b;
    }

    @Data
    private static class C {
        private double c;
    }
}
