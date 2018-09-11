package com.jsako.myconfig;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Date 2018/9/10
 * @Author LLJ
 * @Description
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        BeanDefinition beanDefinition=new GenericBeanDefinition();
        beanDefinition.setBeanClassName(ImportConfig.class.getName());
        String beanName="importConfig";
        registry.registerBeanDefinition(beanName, beanDefinition);
    }
}
