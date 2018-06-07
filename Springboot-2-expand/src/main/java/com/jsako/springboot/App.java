package com.jsako.springboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext("com.jsako.springboot");
		//获取applicationContext的三种方式
		//1.直接在构造方法中注入
		//2.实现ApplicationContextAware接口
		//3.使用@Autowired
		User user = applicationContext.getBean("user",User.class);
		user.show();
		System.out.println(applicationContext);
	
	}
}
