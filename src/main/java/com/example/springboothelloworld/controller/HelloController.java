package com.example.springboothelloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {
    private final Map<String,String> names = new HashMap<>();


    @RequestMapping("/hello")
    public Map<String,String> hello(){
        names.put("name","Rahul");
        names.put("city","Hooghly");
        names.put("state","West Bengal");
        return names;
    }
}
