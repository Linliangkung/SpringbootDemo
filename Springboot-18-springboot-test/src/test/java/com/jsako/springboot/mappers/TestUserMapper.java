package com.jsako.springboot.mappers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Date 2018/12/4
 * @Author LLJ
 * @Description
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestUserMapper {
    
    @MockBean
    private UserMapper userMapper;
        
    @Test
    public void testCreateUser(){
        userMapper.createUser(1);
        BDDMockito.given(null).willReturn("123");
        String user = userMapper.createUser(1);
        System.out.println(user);
    }
}
