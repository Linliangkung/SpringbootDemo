package com.jsako.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Date 2018/9/11
 * @Author LLJ
 * @Description
 */
@Configuration
public class CoreConfig {
    @Bean
    public Runnable runnable1(){
        return ()->System.out.println("runable1");
    }
}
