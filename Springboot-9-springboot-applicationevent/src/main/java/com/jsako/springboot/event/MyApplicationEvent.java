package com.jsako.springboot.event;

import org.springframework.context.ApplicationEvent;

/**
 * @Date 2018/9/16
 * @Author LLJ
 * @Description
 */
public class MyApplicationEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public MyApplicationEvent(Object source) {
        super(source);
    }
}
