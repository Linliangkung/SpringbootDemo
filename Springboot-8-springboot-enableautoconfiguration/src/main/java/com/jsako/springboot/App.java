package com.jsako.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Date 2018/9/10
 * @Author LLJ
 * @Description
 */
@SpringBootApplication
public class App {
    public static void main(String[] args){
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        Runnable runnable1 = context.getBean("runnable1", Runnable.class);
        runnable1.run();
    }
}
