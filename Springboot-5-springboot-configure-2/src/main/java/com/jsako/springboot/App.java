package com.jsako.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.jsako.springboot.config.MyConfig;

@SpringBootApplication
public class App {
	
	@Bean
	@Profile("dev")
	public Runnable createRunnable1(){
		System.out.println("createRunnable1");
		return ()->System.out.println("dev runable");
	}
	
	@Bean
	@Profile("product")
	public Runnable createRunnable2(){
		System.out.println("createRunnable2");
		return ()->System.out.println("dev runable");
	}
	
	
	@Bean
	public Runnable createRunnable3(){
		System.out.println("createRunnable3");
		return ()->System.out.println("default runable");
	}
	
	public static void main(String[] args) {
		SpringApplication application=new SpringApplication(App.class);
		ConfigurableApplicationContext applicationContext=application.run(args);
		MyConfig myConfig = applicationContext.getBean("myConfig",
				MyConfig.class);
		myConfig.show();
	}
}
