package ua.omenyuk.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Omenyuk Vyacheslav
 */

@Controller
public class FirstController {

    @GetMapping("/hello-world")
    public String sayHello(){

        return "hello_world.html";
    }
}
