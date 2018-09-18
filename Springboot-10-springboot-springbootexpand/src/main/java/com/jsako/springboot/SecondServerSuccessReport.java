package com.jsako.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Date 2018/9/18
 * @Author LLJ
 * @Description
 */
@Component
@Order(2)
public class SecondServerSuccessReport implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("second commandline runner");
    }
}
