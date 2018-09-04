package com.jsako.springboot.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class GBKConverterCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String property = System.getProperty("file.encoding");
        if(property!=null){
            return property.equalsIgnoreCase("gbk");
        }
        return false;
    }
}
