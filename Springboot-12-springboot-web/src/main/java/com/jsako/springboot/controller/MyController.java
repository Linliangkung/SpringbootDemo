package com.jsako.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.AbstractEmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;

/**
 * @Date 2018/9/20
 * @Author LLJ
 * @Description
 */
//@RestController
//@RequestMapping("/api/my")
public class MyController {
    @Autowired
    private TomcatEmbeddedServletContainerFactory factory;


    @GetMapping("/helloworld")
    public String helloworld(HttpServletRequest request) {
   /*     System.out.println(request.getServletContext().getRealPath("/test"));
        File file =new File("src/main/webapp");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.exists()?"存在":"不存在");

        System.out.println("=====================");

        System.out.println(getClass().getClassLoader().getResource("").getFile().toString());
        System.out.println(request.getServletContext().getRealPath("/test"));
        System.out.println(System.getProperty("user.dir"));
        Method getUrlsOfJarsWithMetaInfResources = AbstractEmbeddedServletContainerFactory.class.getDeclaredMethod("getUrlsOfJarsWithMetaInfResources");
        getUrlsOfJarsWithMetaInfResources.setAccessible(true);
        List invoke = (List) getUrlsOfJarsWithMetaInfResources.invoke(factory);
        for (Object o : invoke) {
            System.out.println(o);
        }*/
        request.getServletContext().getResourceAsStream("");
        URLClassLoader  classLoader=(URLClassLoader)  MyController.class.getClassLoader();
        URL[] urLs = classLoader.getURLs();
        for (URL urL : urLs) {
            System.out.println(urL);
        }

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
