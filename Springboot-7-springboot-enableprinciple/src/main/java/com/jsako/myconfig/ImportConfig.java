package com.jsako.myconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Date 2018/9/10
 * @Author LLJ
 * @Description
 */
@Configuration
public class ImportConfig {
    @Bean
    public Runnable createRunnable1(){
        return ()->System.out.println("runnable1");
    }
}
