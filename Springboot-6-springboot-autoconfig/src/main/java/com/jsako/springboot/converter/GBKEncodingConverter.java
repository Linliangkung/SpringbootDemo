package com.jsako.springboot.converter;

public class GBKEncodingConverter implements EncodingConverter {
    @Override
    public void encoding() {
        System.out.println("gbk");
    }
}
