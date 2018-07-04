package com.jsako.springboot;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;


@Component
public class MyBeanDefinitionRegistryPostProcessor implements
		BeanDefinitionRegistryPostProcessor {

	@Override
	public void postProcessBeanFactory(
			ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("MyBeanDefinitionRegistryPostProcessor postProcessBeanFactory");
	}

	@Override
	public void postProcessBeanDefinitionRegistry(
			BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("MyBeanDefinitionRegistryPostProcessor postProcessBeanDefinitionRegistry");
		BeanDefinition beanDefinition=BeanDefinitionBuilder.genericBeanDefinition(Person.class).addPropertyValue("name", "super llj").getBeanDefinition();
		registry.registerBeanDefinition("super person", beanDefinition);
	}

}
