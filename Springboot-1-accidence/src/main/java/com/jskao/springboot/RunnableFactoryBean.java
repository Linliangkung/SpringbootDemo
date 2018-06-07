package com.jskao.springboot;

import org.springframework.beans.factory.FactoryBean;

public class RunnableFactoryBean implements FactoryBean<Runnable> {

	@Override
	public Runnable getObject() throws Exception {
		return ()->System.out.println("你好");
	}

	@Override
	public Class<?> getObjectType() {
		return Runnable.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

}
