package com.jsako.springboot;

import com.google.gson.Gson;
import com.jsako.core.config.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Map;

/**
 * @Date 2018/9/10
 * @Author LLJ
 * @Description
 */

/**
 * @SpringBootApplication
 * 中有个注解为@EnableAutoConfiguration他的作用是查询当前类路径下所有jar包中的类路径下的META-INF中的spring.factories文件,
 * 将所有的org.springframework.boot.autoconfigure.EnableAutoConfiguration=全类名中的类查出来。然后作为ImportSelector方法的返回。
 *注解的exclude参数是用来过滤掉那些类不装载进spring 容器.
 */
@SpringBootApplication
public class App {


    public static void main(String[] args){
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        Runnable runnable1 = context.getBean("runnable1", Runnable.class);
        runnable1.run();
        User user = context.getBean(User.class.getName(), User.class);
        System.out.println(user);

        Gson gson = context.getBean("gson", Gson.class);
        String s = gson.toJson("123");
        System.out.println(s);
    }
}
