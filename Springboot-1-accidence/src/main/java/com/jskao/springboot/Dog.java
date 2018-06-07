package com.jskao.springboot;

public class Dog {

	public Dog(){
		System.out.println("Dog创建");
	}
	
	public void init(){
		System.out.println("---init---");
	}
	
	public void destroy(){
		System.out.println("---destroy---");
	}
}
