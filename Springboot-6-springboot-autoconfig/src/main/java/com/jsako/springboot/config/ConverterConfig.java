package com.jsako.springboot.config;

import com.jsako.springboot.condition.GBKConverterCondition;
import com.jsako.springboot.condition.UTF8ConverterCondition;
import com.jsako.springboot.converter.EncodingConverter;
import com.jsako.springboot.converter.GBKEncodingConverter;
import com.jsako.springboot.converter.UTF8EncodingConverter;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

@SpringBootConfiguration
public class ConverterConfig {


    @Bean
    @Conditional({UTF8ConverterCondition.class})
    public EncodingConverter createUTF8Converter(){
        return new UTF8EncodingConverter();
    }

    @Bean
    @Conditional({GBKConverterCondition.class})
    public EncodingConverter createGBKConverter() {
        return new GBKEncodingConverter();
    }
}
