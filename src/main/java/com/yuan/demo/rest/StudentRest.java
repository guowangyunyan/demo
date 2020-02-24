package com.yuan.demo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentRest {
    @RequestMapping("/hello")
    public String queryStudent() {
        return "hello";
    }
}
