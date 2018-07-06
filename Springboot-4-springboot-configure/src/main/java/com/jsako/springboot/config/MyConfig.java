package com.jsako.springboot.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class MyConfig implements InitializingBean{

	@Autowired
	private Environment env;
	private String ip;
	@Value("${com.jsako.port}")
	private Integer port;
	/**
	 * 采用默认值方式，如果找不到com.jsako.name就是用linliangjin,如果没有配置默认值会报错
	 */
	@Value("${com.jsako.name:linliangjin}")
	private String name;
	
	@Value("${com.jsako.ref.name}")
	private String refName;
	
	@Value("${com.jsako.db.url}")
	private String dbUrl;
	
	public void show(){
		System.out.println("ip:"+ip);
		System.out.println("port:"+port);
		System.out.println("name:"+name);
		System.out.println("refName:"+refName);
		System.out.println("dbUrl:"+dbUrl);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		ip=env.getProperty("com.jsako.ip");
	}
	
}
