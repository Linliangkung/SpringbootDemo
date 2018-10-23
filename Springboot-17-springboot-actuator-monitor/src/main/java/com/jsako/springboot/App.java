package com.jsako.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Date 2018/10/23
 * @Author LLJ
 * @Description
 *
 * 自定义健康状态检查:
 * 实现HealthIndicator接口,返回Health标记不同的健康状态值
 */
@SpringBootApplication
public class App {
    public static void main(String[] args){
        SpringApplication.run(App.class, args);
    }
}
