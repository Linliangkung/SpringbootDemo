package com.jsako.springboot.dao;

import com.jsako.springboot.App;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;
import java.net.URLClassLoader;

/**
 * @Date 2018/10/23
 * @Author LLJ
 * @Description
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {TestBeanConfiguration.class})
public class TestUserDao {

    @Autowired
    private UserDao userDao;

    @Autowired
    private Runnable runnable;

    @Test
    public void testSaveUser(){
        runnable.run();
        userDao.saveUser(1,"linliangjin" );
    }
}
