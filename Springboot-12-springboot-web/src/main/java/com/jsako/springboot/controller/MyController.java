package com.jsako.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date 2018/9/20
 * @Author LLJ
 * @Description
 */
@RestController
@RequestMapping("/api/my")
public class MyController {

    @GetMapping("/helloworld")
    public String helloworld(){
        return "hello world良劲";
    }

    /**
     * produces属性用来匹配请求头中的Accept中的参数，并决定这个请求返回的content-type
     * @return
     */
    @GetMapping(value="/testProduces",produces = "text/html")
    public String testProducesHtml(){
        return "testProducesHtml";
    }

    @GetMapping(value="/testProduces",produces = "application/json")
    public String testProducesJson(){
        return "testProducesJson";
    }

}
