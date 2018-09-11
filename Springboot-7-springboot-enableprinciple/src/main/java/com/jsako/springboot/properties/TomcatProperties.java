package com.jsako.springboot.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Date 2018/9/10
 * @Author LLJ
 * @Description
 */
@ConfigurationProperties(prefix = "tomcat")
@Component
public class TomcatProperties {
    private String hostname;
    private String ip;
    private Integer port;
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "TomcatProperties{" +
                "hostname='" + hostname + '\'' +
                ", ip='" + ip + '\'' +
                ", port=" + port +
                '}';
    }
}
