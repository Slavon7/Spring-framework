package ua.omenyuk.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondComtroller {

    @GetMapping("/exit")
    public String exit(){
        return "second/exit";
    }
}