package com.letustryandlearn.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

@GetMapping(path = "/hello")

    public String getMessage(){
        return "hello from Spring boot";
    }
}
