package com.jsako.springboot.annotation;

import com.jsako.springboot.condition.OnMyCondition;
import org.springframework.context.annotation.Conditional;

/**
 * @Date 2018/9/9
 * @Author LLJ
 * @Description
 */
@Conditional(OnMyCondition.class)
public @interface MyConditionOn {
    String value() default "no";
}
