package com.jskao.springboot;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Cat implements InitializingBean,DisposableBean{

	public Cat(){
		System.out.println("Cat init");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("-----afterPropertiesSet-----");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("-----destory-----");
	}

}