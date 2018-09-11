package com.jsako.myconfig;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @Date 2018/9/11
 * @Author LLJ
 * @Description
 */
public class EchoBeanPostProcessor implements BeanPostProcessor {
    private List<String> packages;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
       if(!CollectionUtils.isEmpty(packages)){
           for (String pack : packages) {
               if(bean.getClass().getName().startsWith(pack)){
                   System.out.println(bean.getClass().getName());
               }
           }
       }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    public List<String> getPackages() {
        return packages;
    }

    public void setPackages(List<String> packages) {
        this.packages = packages;
    }
}
