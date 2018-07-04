package com.jsako.springboot;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * 两个方法的返回值不能为null，如果为null会导致容器装载的bean为null
 * @author administartor
 *
 */

//@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

	/**
	 * set****=>postProcessBeforeInitialization=>init
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("---postProcessBeforeInitialization---");
		return bean;
	}
	
	/**
	 * init=>postProcessAfterInitialization
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("---postProcessAfterInitialization---");
		return bean;
	}	
	
}
