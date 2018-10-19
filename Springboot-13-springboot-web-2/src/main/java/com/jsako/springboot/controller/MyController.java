package com.jsako.springboot.controller;

import com.jsako.springboot.App;
import com.jsako.springboot.interceptor.MyInterceptor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;

/**
 * @Date 2018/10/10
 * @Author LLJ
 * @Description
 */
@RestController
@RequestMapping("/api/my")
public class MyController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }

    @RequestMapping("/throwException")
    public String throwExeption(){
        throw new RuntimeException("this is a exception");
    }

    @RequestMapping("/throwException2")
    public String throwException() throws Exception {
        throw new Exception("this is a very important exception");
    }

}
