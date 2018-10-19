package com.jsako.springboot;

import com.jsako.springboot.interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.boot.web.servlet.ErrorPageRegistrar;
import org.springframework.boot.web.servlet.ErrorPageRegistry;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Date 2018/10/10
 * @Author LLJ
 * @Description
    为Servlet容器添加ErrorPage
    1.实现EmbeddedServletContainerCustomizer接口，实现customize方法在container中添加ErrorPage,这种方式对内置tomcat生效
    2.实现ErrorPageRegistrar接口,这种方式对内置或者外置tomcat生效
 */
@SpringBootApplication
public class App extends WebMvcConfigurerAdapter implements ErrorPageRegistrar {
    @Autowired
    private MyInterceptor interceptor;

    public static void main(String[] args){
        SpringApplication.run(App.class,args);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptor);
    }

    @Override
    public void registerErrorPages(ErrorPageRegistry registry) {
        ErrorPage notFoundErrorPage=new ErrorPage(HttpStatus.NOT_FOUND,"/404.html");
        ErrorPage serverErrorPage=new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR,"/500.html");
        ErrorPage runtimeExceptionErrorPage=new ErrorPage(RuntimeException.class,"/runtimeException.html");
        registry.addErrorPages(notFoundErrorPage,serverErrorPage,runtimeExceptionErrorPage);
    }

    /*@Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        ErrorPage notFoundErrorPage=new ErrorPage(HttpStatus.NOT_FOUND,"/404.html");
        ErrorPage serverErrorPage=new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR,"/500.html");
        ErrorPage runtimeExceptionErrorPage=new ErrorPage(RuntimeException.class,"/runtimeException.html");
        container.addErrorPages(notFoundErrorPage,serverErrorPage,runtimeExceptionErrorPage);
    }*/
}
