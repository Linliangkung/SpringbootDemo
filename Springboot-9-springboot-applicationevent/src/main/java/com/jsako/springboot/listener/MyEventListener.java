package com.jsako.springboot.listener;

import com.jsako.springboot.event.MyApplicationEvent;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @Date 2018/9/16
 * @Author LLJ
 * @Description
 */
@Component
public class MyEventListener  {


    @EventListener
    public void event(MyApplicationEvent event){
        System.out.println(event);
    }

    @EventListener
    /**
     * 由于ApplicationEnvironmentPreparedEvent是在spring对象创建前已经发布,这是创建这个监听器已经无法监听到ApplicationEnvironmentPreparedEvent事件
     */
    public void event2(ApplicationEnvironmentPreparedEvent event){
        String test = event.getEnvironment().getProperty("com.jsako.test");
        System.out.println(test);
    }

}
