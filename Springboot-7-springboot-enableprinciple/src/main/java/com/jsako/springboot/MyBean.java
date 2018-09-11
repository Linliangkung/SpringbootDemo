package com.jsako.springboot;

import org.springframework.scheduling.annotation.Async;

/**
 * @Date 2018/9/10
 * @Author LLJ
 * @Description
 */
public class MyBean {

    @Async
    public void exec(){
        for (int i = 1; i <=5 ; i++) {
            System.out.println("执行"+i+"次,当前线程:"+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
