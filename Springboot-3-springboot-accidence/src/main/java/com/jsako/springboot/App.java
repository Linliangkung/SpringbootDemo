package com.jsako.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.jsako.springboot.beans.HelloBean;
//默认扫描路径已类App的包名
//@SpringBootApplication
@ComponentScan
public class App {
	@Bean
	public Runnable createRunable(){
		
		return ()->System.out.println("runable is runing");
	}
	
	
	public static void main(String[] args) {
		//第一个参数作用是将类App作为一个配置类在Spring 容器中创建
		ConfigurableApplicationContext applicationContext = SpringApplication.run(App.class, args);
		 HelloBean helloBean = applicationContext.getBean("helloBean",HelloBean.class);
		//Object bean2 = applicationContext.getBean("testScanBean");
		System.out.println(helloBean);
		
		Runnable runable1=applicationContext.getBean("createRunable",Runnable.class);
		runable1.run();
		
		Runnable runable2=applicationContext.getBean("createMySpringbootRunable",Runnable.class);
		runable2.run();
	}
}
