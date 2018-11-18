package com.example.jenkinstest1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ze
 * @date 2018/11/18 0018
 */
@RestController
@SpringBootApplication
public class test1 {
    @RequestMapping(value = "/hello")
    public String getting(){
        return "hello world nihao呀";
    }
}
