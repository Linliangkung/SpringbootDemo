package com.jsako.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import sun.tools.jar.CommandLine;

/**
 * @Date 2018/9/18
 * @Author LLJ
 * @Description
 */
@Component
@Order(1)
public class ServerSuccessReport implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("成功启动springboot项目");
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
