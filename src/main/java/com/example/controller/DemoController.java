package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    
    @GetMapping("/demo")
    public String getData(){
        System.out.println("OK OK OK");
        return "test";
    }
    
}
