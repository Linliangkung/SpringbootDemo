package com.jsako.springboot;

import com.jsako.annotation.EnableRedis;
import com.jsako.client.Redis;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Date 2018/10/19
 * @Author LLJ
 * @Description
 */
@SpringBootApplication
@EnableRedis
public class App {

    public static void main(String[] args){
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        Redis redis = context.getBean("redis", Redis.class);
        redis.del();
    }
}
