package com.jsako.springboot;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component 
public class User implements ApplicationContextAware{
	
	//@Autowired
    private ApplicationContext applicationContext;
    
	@PostConstruct
    public void init(){
    	System.out.println("User Init");
    }
    
    public User() {
	}
    
    
	public void show(){
		System.out.println(applicationContext);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		System.out.println("==set");
		this.applicationContext=applicationContext;
	}
	
}
