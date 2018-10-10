package com.jsako.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Date 2018/10/9
 * @Author LLJ
 * @Description
 */
@Controller
@RequestMapping("/api/freemarker")
public class FreemarkerController {


    /**
     * 配置freemarker模板路径，多个可以用逗号隔开
     * spring.freemarker.templateLoaderPath=classpath:/freemarker/,classpath:/freemarkertest
     */
    @GetMapping("/hello")
    public String helloFreemarker(){
        return "hello";
    }

    @GetMapping("/testFreemarkerParam")
    public String testFreemarkerParam(Model model){
        model.addAttribute("param","i love freemarker" );
        return "/test/freemarkerParam";
    }
}
