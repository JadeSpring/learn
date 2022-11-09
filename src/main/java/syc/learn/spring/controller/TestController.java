package syc.learn.spring.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import syc.learn.spring.domain.Response;

/**
 * @author syc
 * @date 2020/7/8
 */
@RestController
@RequestMapping("api")
@CrossOrigin
public class TestController {


    @RequestMapping("test")
    public Response test() {
        return Response.ok("test");
    }
}
