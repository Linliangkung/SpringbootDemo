package com.jsako.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.jsako.springboot.config.MyConfig;
import com.jsako.springboot.config.MyConfigurationPropertiesConifg;

@SpringBootApplication
// 使用@PropertySource加载其他配置文件
@PropertySource("dbconfig/db.properties")
public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication
				.run(App.class, args);
		MyConfig myConfig = applicationContext.getBean("myConfig",
				MyConfig.class);
		MyConfigurationPropertiesConifg myConfigurationPropertiesConifg = applicationContext
				.getBean("myConfigurationPropertiesConifg",
						MyConfigurationPropertiesConifg.class);
		System.out.println("--------------myConfig show-----------------");
		myConfig.show();
		System.out.println("--------------myConfigurationPropertiesConifg show-----------------");
		myConfigurationPropertiesConifg.show();
	}
}
