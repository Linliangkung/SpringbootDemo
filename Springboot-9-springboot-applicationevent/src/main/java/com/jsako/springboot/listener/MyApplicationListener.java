package com.jsako.springboot.listener;

import com.jsako.springboot.event.MyApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Date 2018/9/16
 * @Author LLJ
 * @Description
 */
//@Component
public class MyApplicationListener implements ApplicationListener<MyApplicationEvent> {
    @Override
    public void onApplicationEvent(MyApplicationEvent event) {
        System.out.println("MyApplicationListener onApplicationEvent"+event);
    }

}
