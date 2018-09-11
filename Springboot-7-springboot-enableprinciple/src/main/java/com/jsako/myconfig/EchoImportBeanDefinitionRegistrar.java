package com.jsako.myconfig;

import com.jsako.springboot.EnableEcho;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

/**
 * @Date 2018/9/11
 * @Author LLJ
 * @Description
 */
public class EchoImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        Map<String, Object> attributes = importingClassMetadata.getAnnotationAttributes(EnableEcho.class.getName());
        String[] packages = (String[]) attributes.get("value");
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.rootBeanDefinition(EchoBeanPostProcessor.class);
        beanDefinitionBuilder.addPropertyValue("packages", packages);
        registry.registerBeanDefinition(EchoBeanPostProcessor.class.getName(),beanDefinitionBuilder.getBeanDefinition());
    }
}
