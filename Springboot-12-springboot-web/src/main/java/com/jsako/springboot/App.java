package com.jsako.springboot;

import com.jsako.springboot.filter.MyFilter;
import com.jsako.springboot.listener.MyListener;
import com.jsako.springboot.servlet.MyServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

/**
 * @Date 2018/9/20
 * @Author LLJ
 * @Description
 */
@SpringBootApplication
//@ServletComponentScan
public class App  {
    public static void main(String[] args){
        SpringApplication.run(App.class, args);
    }

    @Bean
    public  ServletRegistrationBean registrationMyServlet(){
        ServletRegistrationBean bean=new ServletRegistrationBean(new MyServlet(),"/testServlet");
        return bean;
    }

    @Bean
    public FilterRegistrationBean registrationMyFilter(){
        MyFilter myFilter = new MyFilter();
        FilterRegistrationBean bean=new FilterRegistrationBean(myFilter);
        bean.setUrlPatterns(Arrays.asList("/*"));
        return bean;
    }

    @Bean
    public ServletListenerRegistrationBean registrationMyListener(){
        ServletListenerRegistrationBean bean=new ServletListenerRegistrationBean(new MyListener());
        return bean;
    }
}
