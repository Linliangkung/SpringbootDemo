package com.jsako.springboot.converter;

public class UTF8EncodingConverter implements  EncodingConverter{
    @Override
    public void encoding() {
        System.out.println("utf-8");
    }
}
