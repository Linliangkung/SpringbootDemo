package com.jsako.springboot.config;

import com.jsako.myconfig.MyImportBeanDefinitionRegistrar;
import com.jsako.springboot.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Date 2018/9/10
 * @Author LLJ
 * @Description
 */


/**
 * @Import注解  1.当导入一个普通类时,引入class类将作为一个对象放入spring容器中管理起来，name为全类名
 *              2.当导入一个ImportSelector实现类时,spring会根据返回的String数组创建数组对应的全类名的bean，放入spring容器中托管(EnableAutoConfiguration就是这个原理)
 *             3.当导入一个ImportBeanDefinitionRegistrar时实现类时,spring会调用registerBeanDefinitions注册bean
 */
@Configuration
//@Import({ImportConfig.class})
//@Import({MyImportSelector.class})
@Import({MyImportBeanDefinitionRegistrar.class})
public class MyConfig {

    @Bean
    public MyBean myBean(){
        return new MyBean();
    }
}
