package com.jsako.springboot;

import com.jsako.springboot.converter.EncodingConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Map;

@SpringBootApplication
public class App {
    public static void main(String[] args){
        ConfigurableApplicationContext application = SpringApplication.run(App.class,args );
        Map<String, EncodingConverter> beansOfType = application.getBeansOfType(EncodingConverter.class);
        System.out.println(beansOfType);
    }

}
