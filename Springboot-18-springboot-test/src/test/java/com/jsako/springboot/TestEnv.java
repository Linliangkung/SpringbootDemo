package com.jsako.springboot;

import com.jsako.springboot.dao.TestBeanConfiguration;
import com.jsako.springboot.dao.UserDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.util.EnvironmentTestUtils;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.PostConstruct;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @Date 2018/10/24
 * @Author LLJ
 * @Description
 *
 * 在测试环境使用不同配置项:
 * 1.在test/resources下加入application.properties配置文件
 * 2.在SpringBootTest注解中的properties属性中加入key=value的值
 * 3.在使用EnvironmentTestUtils.addEnvironment添加配置项
 *
 * 加载顺序为1->2->3
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=TestBeanConfiguration.class/*,properties = {"app.version=1.0.0"}*/)
public class TestEnv {
    /*@Autowired
    private Environment environment;*/

    @Autowired
    private ConfigurableApplicationContext context;


    @PostConstruct
    public void init(){
       // EnvironmentTestUtils.addEnvironment(context,"app.version=2.0.0");
    }
    @Autowired
    private Runnable runnable;

    @Autowired
    private UserDao userDao;


    @Test
    public void test() {
        //Assert.assertEquals("springboot_test", environment.getProperty("my.app"));
        //Assert.assertEquals(environment.getProperty("app.version"),"1.0.");
        String property = context.getEnvironment().getProperty("app.version");
        System.out.println(property);
        runnable.run();
        userDao.saveUser(1,"asd" );
    }
}
