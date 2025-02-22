package syc.learn.json;


import lombok.Data;

import java.util.concurrent.TimeUnit;

@Data
public class SelectValue {
    private String label;
    private Object value;

    private Integer dataType;
    /**
     * 时间单位
     */
    private TimeUnit timeUnit;


    public SelectValue() {
    }

    public SelectValue(String label, Object value, Integer dataType) {
        this.label = label;
        this.value = value;
        this.dataType = dataType;
    }

    public SelectValue(String label, Object value, TimeUnit timeUnit) {
        this.label = label;
        this.value = value;
        this.timeUnit = timeUnit;
    }

}
