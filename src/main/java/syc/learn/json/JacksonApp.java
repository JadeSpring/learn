package syc.learn.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import org.apache.kafka.common.message.UpdateFeaturesResponseData;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author syc
 * @date 2024/8/23
 */
public class JacksonApp {
    public static void main(String[] args)  throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();

        List<SelectValue> list = new ArrayList<>();
        list.add(new SelectValue("1", "2", TimeUnit.HOURS));
        list.add(new SelectValue("1", "3", TimeUnit.MINUTES));
        System.out.println(objectMapper.writeValueAsString(list));
    }

    @Data
    public static class A {
        @JsonProperty("wOIStatus")
        private int wOIStatus;
    }


}
