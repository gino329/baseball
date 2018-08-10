package com.example.yakisoba;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Yummy {

    @GetMapping("/")
    public String hello(){
        return "hello";
    }
}
