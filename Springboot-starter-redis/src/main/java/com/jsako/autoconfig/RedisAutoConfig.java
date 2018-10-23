package com.jsako.autoconfig;

import com.jsako.client.Redis;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Date 2018/10/19
 * @Author LLJ
 * @Description
 */
@Configuration
@ConditionalOnClass(Redis.class)
@EnableConfigurationProperties(RedisProperties.class)
public class RedisAutoConfig {

    @Bean
    public Redis redis(RedisProperties redisProperties) {
        return new Redis(redisProperties.getUrl(),
                redisProperties.getUsername(),
                redisProperties.getPassword());
    }
}
