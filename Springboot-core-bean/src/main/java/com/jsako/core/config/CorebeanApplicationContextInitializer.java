package com.jsako.core.config;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Date 2018/9/18
 * @Author LLJ
 * @Description
 */
public class CorebeanApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println(getClass().getName()+",count:"+applicationContext.getBeanDefinitionCount());
    }
}
