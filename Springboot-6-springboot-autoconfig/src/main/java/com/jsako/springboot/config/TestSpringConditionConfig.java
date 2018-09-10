package com.jsako.springboot.config;

import com.jsako.springboot.annotation.MyConditionOn;
import com.jsako.springboot.bean.MyBean;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

/**
 * @Date 2018/9/9
 * @Author LLJ
 * @Description
 */

@SpringBootConfiguration
public class TestSpringConditionConfig {


    /**
     * @return
     * @ConditionalOnProperty的作用是，当上下文存在prefix.name的配置时，如果与havingValue的值相等，装载这个bean,否则不状态。 当配置了matchIfMissing=true（默认为false）如果没有prefix.name的配置时，也装载着bean
     */
    @Bean
    @ConditionalOnProperty(prefix = "com.jsako", name = "condition", havingValue = "open", matchIfMissing = true)
    public Runnable createRunnable1() {
        return () -> System.out.println("createRunnable1");
    }


    @Bean
    //@ConditionalOnMissingBean(name={"createRunnable1"})
    public Runnable createRunnable2(){
        return () -> System.out.println("createRunnable2");
    }


    @Bean
    @MyConditionOn("yes")
    public Runnable createRunnable3(){
        return () -> System.out.println("createRunnable3");
    }

    @Bean
    @ConditionalOnMissingBean
    public MyBean myBean1(){
        return new MyBean("bean1");
    }

    /**
     * @CondiionalOnMissingBean  默认下如果spring上下文没有当前需要创建的类型的bean时，创建bean。如果有则不创建。
     * name配置如果当前上下文有这个名字的bean就不创建,如果没有就创建。value配置如果当前上下文有这个类型(class)的bean就不创建,如果没有就创建
     * @return
     */
    @Bean
    @ConditionalOnMissingBean(name="createRunnable4")
    public MyBean myBean2(){
        return new MyBean("bean2");
    }

}