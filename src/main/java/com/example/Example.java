package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zcluo on 2017/1/22.
 */
@RestController
@EnableAutoConfiguration
public class Example {
    @RequestMapping("/")
    String home(){
        return "Hello World! I am comming!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class,args);
    }
}
