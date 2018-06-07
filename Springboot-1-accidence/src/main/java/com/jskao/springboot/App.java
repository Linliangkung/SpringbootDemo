package com.jskao.springboot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
		//创建普通bean
		MyBean bean1 = context.getBean(MyBean.class);
		System.out.println(bean1);
		MyBean bean2=(MyBean) context.getBean("myBean");
		System.out.println(bean2);
		
		
		//创建FactoryBean
		Runnable runnable=(Runnable) context.getBean("myRunnable");
		runnable.run();
		
		
		
		context.close();
	}
}
