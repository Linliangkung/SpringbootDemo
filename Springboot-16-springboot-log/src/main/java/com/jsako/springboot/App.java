package com.jsako.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Date 2018/10/22
 * @Author LLJ
 * @Description
 *
 * Springboot默认的日志级别是info(日志级别优先级(高->低):OFF、FATAL、ERROR、WARN、INFO、DEBUG、TRACE,
 * 系统日志级别设置后会将比当前级别高的日志也打印出来，也就是设置了INFO的日志级别，就能将WARN...OFF的日志输出)
 *
 * 可以通过配置logging.level.root来设置当前系统的日志级别
 *
 * logging.file配置Springboot默认文件输出器日志文件输出位置
 *
 * logging.pattern.console 配置控制台输出日志格式
 *
 * logging.pattern.file  配置日志文件输出格式
 *
 * application.properties中配置的日志配置是最终配置，即在logback.xml配置的会被替换成application.properties中的配置
 *
 * Springboot默认支持log4j2和logback两种日志框架，对log4j是不支持的(在application.properties是不支持配置的)
 */
@SpringBootApplication
public class App {

    public static void main(String[] args){
        ConfigurableApplicationContext run = SpringApplication.run(App.class, args);
        Logger logger = LoggerFactory.getLogger(App.class.getName());
        logger.info("hello world");
        logger.error("呵呵error");
    }
}