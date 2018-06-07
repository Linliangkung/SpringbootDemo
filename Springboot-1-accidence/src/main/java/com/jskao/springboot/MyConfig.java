package com.jskao.springboot;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@Configurable
public class MyConfig {

	@Bean(name="myBean")
	@Scope("prototype")
	public MyBean createMyBean(){
		return new MyBean();
	}
	
	@Bean(name="myRunnable")
	public RunnableFactoryBean runnableFactoryBean(){
		return new RunnableFactoryBean();
	}
}
