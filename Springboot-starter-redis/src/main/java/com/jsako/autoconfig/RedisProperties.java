package com.jsako.autoconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Date 2018/10/19
 * @Author LLJ
 * @Description
 */
@ConfigurationProperties(prefix = "jsako.redis")
public class RedisProperties {
    private String url;
    private String username;
    private String password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
