package com.jsako.springboot.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class MySpringbootConfig {

	@Bean
	public Runnable createMySpringbootRunable(){
		return ()->System.out.println("createMySpringbootRunable is runing");
	}
	
}
