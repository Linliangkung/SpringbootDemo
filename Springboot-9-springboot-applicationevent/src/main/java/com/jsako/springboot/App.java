package com.jsako.springboot;

import com.jsako.springboot.event.MyApplicationEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Date 2018/9/16
 * @Author LLJ
 * @Description
 */

/**
 * spring加监听器的方法:
 * 1.SpringApplication.addListeners();
 * 2.将Listener加入到spring容器中
 * 3.在配置文件中加入context.listener.classes的配置(DelegatingApplicationListener监听器将application.properties中的配置读出,将监听器加入到spring容器中)
 * 4.在spring容器管理的对象中 增加一个方法用@EventListener标记起来,参数为ApplicationEvent类或者其子类。如果spring里的发布的事件匹配上这个参数的类型则调用。(EventListenerMethodProcessor)
 */
@SpringBootApplication
public class App {
    public static void main(String[] args){
        SpringApplication app=new SpringApplication(App.class);
//        app.addListeners(new MyApplicationListener());
        ConfigurableApplicationContext context = app.run(args);
        context.publishEvent(new MyApplicationEvent(args));

    }

}
