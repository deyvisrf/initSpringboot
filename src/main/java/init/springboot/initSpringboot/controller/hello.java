package init.springboot.initSpringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class hello {

    @RequestMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello";
    }
}
