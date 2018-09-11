package com.jsako.springboot;

import com.jsako.myconfig.ImportConfig;
import com.jsako.springboot.config.MyConfig;
import com.jsako.springboot.properties.TomcatProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.Map;

/**
 * @Date 2018/9/10
 * @Author LLJ
 * @Description
 */
@ComponentScan
@EnableConfigurationProperties
@EnableAsync
@EnableEcho({"com.jsako.myconfig"})
public class App {
    
    public static void main(String[] args){
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        TomcatProperties tomcatProperties = context.getBean("tomcatProperties", TomcatProperties.class);
        System.out.println(tomcatProperties);

        MyBean myBean = context.getBean("myBean", MyBean.class);
        myBean.exec();
        System.out.println("==================END================");

        MyConfig myConfig=context.getBean("myConfig", MyConfig.class);
        System.out.println(myConfig);

        Runnable createRunnable1 = context.getBean("createRunnable1", Runnable.class);
        createRunnable1.run();


        Map<String, ImportConfig> importConfig = context.getBeansOfType(ImportConfig.class);
        System.out.println(importConfig);
    }
}
