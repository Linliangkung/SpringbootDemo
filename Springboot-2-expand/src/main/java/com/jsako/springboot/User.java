package com.jsako.springboot;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component 
public class User implements ApplicationContextAware{
	
	//@Autowired
    private ApplicationContext applicationContext;
	
    public User(ApplicationContext applicationContext) {
    	this.applicationContext=applicationContext;
	}
    
	public void show(){
		System.out.println(applicationContext);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		//this.applicationContext=applicationContext;
	}
	
	
	
}
