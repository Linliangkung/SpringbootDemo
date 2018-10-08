package com.jsako.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * @Date 2018/9/20
 * @Author LLJ
 * @Description
 */
@RestController
@RequestMapping("/api/my")
public class MyController {

    @GetMapping("/helloworld")
    public String helloworld(HttpServletRequest request){
        System.out.println(request.getServletContext().getRealPath("/test"));
        File file =new File("src/main/webapp");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.exists()?"存在":"不存在");

        System.out.println("=====================");

        System.out.println(getClass().getClassLoader().getResource("").getFile().toString());
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
