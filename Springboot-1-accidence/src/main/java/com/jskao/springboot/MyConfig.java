package com.jskao.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
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
	
	
	@Bean
	public CarFactoryBean carFactoryBean(){
		return new CarFactoryBean();
	}

	@Bean 
	public Car createCar(CarFactoryBean carFactoryBean){
		return carFactoryBean.create();
	}
	
	@Bean
	public Cat createCat(){
		return new Cat();
	}
	
	@Bean(initMethod="init",destroyMethod="destroy")
	public Dog createDog(){
		return new Dog();
	}
	
	@Bean
	public Animal createAnimal(){
		return new Animal();
	}
	
	@Bean
	public UserDao createUserDao(){
		return new UserDao();
	}

}
