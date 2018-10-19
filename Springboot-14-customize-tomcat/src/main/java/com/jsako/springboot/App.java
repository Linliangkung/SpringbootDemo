package com.jsako.springboot;

import org.apache.catalina.connector.Connector;
import org.apache.coyote.ProtocolHandler;
import org.apache.coyote.http11.Http11NioProtocol;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;

import java.io.File;

/**
 * @Date 2018/10/18
 * @Author LLJ
 * @Description
 * 三种定制内置tomcat配置项方式
 * 1.在application.properties中指定一些配置项
 * 2.实现EmbeddedServletContainerCustomizer接口，创建该类对象并交给spring容器管理
 * 3.创建TomcatEmbeddedServletContainerFactory对象，并交给spring容器管理
 */
@SpringBootApplication
public class App implements EmbeddedServletContainerCustomizer {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        TomcatEmbeddedServletContainerFactory factory= (TomcatEmbeddedServletContainerFactory) container;
        factory.setPort(80);
        factory.setBaseDirectory(new File("D:/tmp/tomcat"));
        TomcatConnectorCustomizer tomcatConnectorCustomizers=new MyTomcatConnectorCustomizer();
        factory.addConnectorCustomizers(tomcatConnectorCustomizers);
    }

    public static class MyTomcatConnectorCustomizer implements  TomcatConnectorCustomizer{

        @Override
        public void customize(Connector connector) {
            Http11NioProtocol protocolHandler = (Http11NioProtocol) connector.getProtocolHandler();
            protocolHandler.setMaxConnections(1000);//设置内置tomcat最大连接数
            protocolHandler.setMaxThreads(100);//设置内置tomcat最大线程数
        }
    }


}
