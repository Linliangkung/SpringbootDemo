package com.jsako.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Date 2018/9/18
 * @Author LLJ
 * @Description
 */

/**
 * ApplicationContextInitializer类是spring容器启动初始化回调的(spring容器refreshed方法执行前的回调)
 * 注册ApplicationContextInitializer方式:
 * 1.通过SpringApplication.addInitializers注册
 * 2.通过在springboot配置文件中配置(context.initializer.classes=com.jsako.springboot.MyApplicationContextInitializer)
 * 3.通过spring.factories机制配置(org.springframework.context.ApplicationContextInitializer=ApplicationContextInitializer)
 *
 * CommandLineRunner类是springboot容器启动最后一个回调
 */
@SpringBootApplication
public class App {
    public static void main(String[] args){
        SpringApplication application=new SpringApplication(App.class);
        //application.addInitializers(new MyApplicationContextInitializer());
        ConfigurableApplicationContext context = application.run(args);
        System.out.println(context);
    }
}
