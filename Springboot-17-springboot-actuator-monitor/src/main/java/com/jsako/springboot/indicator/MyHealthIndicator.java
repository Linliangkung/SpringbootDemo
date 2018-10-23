package com.jsako.springboot.indicator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @Date 2018/10/23
 * @Author LLJ
 * @Description
 */
@Component
public class MyHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        return Health.down().withDetail("error","springboot down").build();
    }
}
