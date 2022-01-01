package syc.learn.spring.domain;

import lombok.Data;

/**
 * @author syc
 * @date 2020/7/8
 */
@Data
public class Response {
    private int code;
    private Object data;

    public Response(int code, Object data) {
        this.code = code;
        this.data = data;
    }

    public static Response ok(Object data) {
        return new Response(1000, data);
    }
}
