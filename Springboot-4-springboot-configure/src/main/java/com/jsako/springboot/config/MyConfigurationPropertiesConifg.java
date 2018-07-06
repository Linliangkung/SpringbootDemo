package com.jsako.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 注入配置的第三种方式是通过@ConfigurationProperties注解配置前缀，在类中配置属性与结尾匹配就能注入了
 * @author LLJ
 * 2018年7月6日
 */
@Component
@ConfigurationProperties(prefix="com.jsako")
public class MyConfigurationPropertiesConifg {
	
	private String ip;
	private Integer port;
	private String name;
	

	public void show(){
		System.out.println("ip:"+ip);
		System.out.println("port:"+port);
		System.out.println("name:"+name);
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
