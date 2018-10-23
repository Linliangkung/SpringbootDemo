package com.jsako.annotation;

import com.jsako.autoconfig.RedisAutoConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @Date 2018/10/19
 * @Author LLJ
 * @Description
 */
@Target(ElementType.TYPE)
@Import(RedisAutoConfig.class)
//此配置标志这个注解在运行时是否也存在,如果不标明。编译阶段就会从类上移除掉。
@Retention(RetentionPolicy.RUNTIME)
public @interface EnableRedis {
}
