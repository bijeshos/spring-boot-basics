package io.github.bijeshos.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/spring-boot-basics-demo/home")
    @ResponseBody
    String home() {
        return "Hello there, good to see you here!";
    }
}
