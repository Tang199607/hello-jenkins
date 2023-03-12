package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TangYong
 * @date 2023年03月12日 20:49
 */
@RestController("/hello")
public class HelloController {

    @RequestMapping("/haha")
    public String hello() {
        return "hello jenkins";
    }
}
