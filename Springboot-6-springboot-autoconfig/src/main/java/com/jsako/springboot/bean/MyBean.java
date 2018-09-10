package com.jsako.springboot.bean;

/**
 * @Date 2018/9/9
 * @Author LLJ
 * @Description
 */
public class MyBean {
    private String name;

    public MyBean(String name) {
        this.name = name;
    }

    public MyBean(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
