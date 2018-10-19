package com.jsako.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date 2018/10/18
 * @Author LLJ
 * @Description
 */
@RestController
@RequestMapping("/api/test")
public class TestController {

    @RequestMapping("/hello")
    public String hello(){
        System.out.println(System.getProperty("file.encoding"));
        System.out.println(System.getProperty("user.dir"));
        return "hello";
    }

}
