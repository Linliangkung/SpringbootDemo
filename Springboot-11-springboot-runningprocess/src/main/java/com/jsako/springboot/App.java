package com.jsako.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Collection;

/**
 * @Date 2018/9/18
 * @Author LLJ
 * @Description
 */

/**
 * Springboot 启动流程
 * 1.推断是否WEB环境
 * 2.加载所有classpath下的META-INF/spring.factories下的ApplicationContextInitializer
 * 3.加载所有classpath下的META-INF/spring.factories下的ApplicationListener
 * 4.推断main所在的类
 * 5.开始执行run方法
 * 6.设置java.awt.headless系统变量
 * 7.执行SpringApplicationRunListner的started方法
 * 8.创建ApplicationArguments
 * 9.创建environment(web环境创建StandardServletEnvironment,非web环境创建StandardEnvironment)
 * 10.配置environment,主要是把run方法的参数配置进environment
 * 11.执行SpringApplicationRunListner的environmentPrepared方法
 * 12.创建ConfigurableApplicationContext(web环境创建AnnotationConfigEmbeddedWebApplicationContext,非web环境AnnotationConfigApplicationContext)
 * 13.准备ConfigurableApplicationContext
 * 14.回调所有ApplicationContextInitializer.initialize方法
 * 15.回调SpringApplicationRunListner的contextPrepared方法
 * 16.将ApplicationArguments和Banner注册到Spring容器中
 * 17.将source中的类注册到Spring容器中
 * 18.回调SpringApplicationRunListner的contextLoaded方法
 * 19.刷新ConfigurableApplicationContext(这是spring容器真正创建bean,走spring bean生命周期的方法)
 * 20.回调ApplicationRunner和CommandLineRunner
 * 21.回调SpringApplicationRunListner的finished方法
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) throws ClassNotFoundException {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
            //推断出当前的方法栈的main方法所属的类
        /*  StackTraceElement[] stackTrace = new RuntimeException().getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if ("main".equals(stackTraceElement.getMethodName())) {
                    System.out.println(Class.forName(stackTraceElement.getClassName()));
                }
            }*/
    }
}
