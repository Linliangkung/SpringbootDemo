package com.jsako.springboot;

import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.stereotype.Component;

/**
 * spring boot 拓展接口需要在META-INF/spring.factories中注册 key=EnvironmentPostProcessor全类名，value=实现类全类名
 * @author LLJ
 * 2018年7月6日
 */
@Component
public class MyEnvironmentPostProcessor implements EnvironmentPostProcessor {
	@Override
	public void postProcessEnvironment(ConfigurableEnvironment environment,
			SpringApplication application) {
		Properties source=new Properties();
		source.put("com.jsako.environment.processor.port", "808038812");
		PropertiesPropertySource propertiesPropertySource=
				new PropertiesPropertySource("myProperties", source);
		environment.getPropertySources().addLast(propertiesPropertySource);
	}

}
