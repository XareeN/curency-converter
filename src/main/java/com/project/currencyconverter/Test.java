package com.project.currencyconverter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @GetMapping("/hello")
    public String printHello(){
        return "Hello, it's working!";
    }

}
