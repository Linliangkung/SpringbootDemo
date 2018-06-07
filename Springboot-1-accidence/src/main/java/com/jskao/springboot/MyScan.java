package com.jskao.springboot;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan(value="com.jskao.springboot")
//@ComponentScan(value="com.jskao.springboot",excludeFilters={@Filter(type=FilterType.ASSIGNABLE_TYPE,classes=MyConfig.class)})
public class MyScan {

}
