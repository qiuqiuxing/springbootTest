package com.example.springboottest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class AopTestController {

    @RequestMapping("/world")
    public  String  hello(@RequestParam String name){
        return "hello"+name;
    }
}
