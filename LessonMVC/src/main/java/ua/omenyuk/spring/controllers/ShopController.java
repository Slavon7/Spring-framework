package ua.omenyuk.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// @RequestMapping("/shop")
public class ShopController {

    @GetMapping("/hello")
    public String helloPage() {
        return "shop/hello";
    }

    @GetMapping("/goodbye")
    public String goodByePage(){
        return "shop/goodbye";
    }
}
