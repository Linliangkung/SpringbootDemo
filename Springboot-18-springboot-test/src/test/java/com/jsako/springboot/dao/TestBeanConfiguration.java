package com.jsako.springboot.dao;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * @Date 2018/10/24
 * @Author LLJ
 * @Description
 *
 * @SpringbootTest注解默认会在当前测试类包下寻找此包名的父包中的配置类,如果找到就是用这个Config作为配置类。
 * 后续还会寻找@TestConfiguration注解的类作为配置类注入进spring容器中使用
 */
@TestConfiguration
public class TestBeanConfiguration {

    @Bean
    public Runnable runnable(){
        return ()->System.out.println("123");
    }
}
