package com.jsako.springboot.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "com.jsako.list")
public class MyConfig {

	/**
	 * 如果需要注入的是一个数组,那么在properties里每个元素需要用,隔开
	 */
	@Value("${com.jsako.names}")
	private String[] names;
	/**
	 * 如果需要注入的是一个List集合，那么只会拿到对应的value放进List的第一个元素中，不会以，分隔开在逐一注入。
	 */
	private List<String> names2;

	@Value("${com.jsako.environment.processor.port}")
	private Integer port;

	@Value("${com.jsako.url}")
	private String url;

	public List<String> getNames2() {
		return names2;
	}

	public void setNames2(List<String> names2) {
		this.names2 = names2;
	}

	public void show() {
		System.out.println("-------------names1--------------");
		for (String string : names) {
			System.out.println(string);
		}
		System.out.println("-------------names2--------------");

		for (String string : names2) {
			System.out.println(string);
		}

		System.out.println("-------------port--------------");

		System.out.println("port:" + port);

		System.out.println("-------------url--------------");

		System.out.println("url:" + url);
	}

}
