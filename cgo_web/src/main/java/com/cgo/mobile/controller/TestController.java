package com.cgo.mobile.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {


    //test ciommit init
    @RequestMapping("/zzzz")
    public String test(){
        return "Aaa";
    };
}
