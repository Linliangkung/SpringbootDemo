package com.jsako.springboot;

import com.jsako.springboot.converter.EncodingConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Map;

@SpringBootApplication
public class App {

    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext application = SpringApplication.run(App.class,args );
        Map<String, EncodingConverter> beansOfType = application.getBeansOfType(EncodingConverter.class);
        System.out.println(beansOfType);

        Runnable createRunnable2 = application.getBean("createRunnable2", Runnable.class);
        createRunnable2.run();

        Runnable createRunnable3 = application.getBean("createRunnable3", Runnable.class);
        createRunnable3.run();

        Runnable createRunnable1 = application.getBean("createRunnable1", Runnable.class);
        createRunnable1.run();


    }

}
