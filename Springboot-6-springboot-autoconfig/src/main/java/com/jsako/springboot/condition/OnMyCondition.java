package com.jsako.springboot.condition;

import com.jsako.springboot.annotation.MyConditionOn;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.MultiValueMap;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Date 2018/9/9
 * @Author LLJ
 * @Description
 */
public class OnMyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        MultiValueMap<String, Object> allAnnotationAttributes = metadata.getAllAnnotationAttributes(MyConditionOn.class.getName());
        Set<Map.Entry<String, List<Object>>> entries = allAnnotationAttributes.entrySet();
        String value = null;
        for (Map.Entry<String, List<Object>> entry : entries) {
            if (entry.getKey().equals("value")) {
                value = (String) entry.getValue().get(0);
            }
        }
        if ("yes".equals(value)) {
            return true;
        }
        return false;
    }
}
