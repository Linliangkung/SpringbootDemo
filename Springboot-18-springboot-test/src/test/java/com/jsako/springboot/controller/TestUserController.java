package com.jsako.springboot.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * @Date 2018/12/5
 * @Author LLJ
 * @Description
 *
 * 测试Controller方式:
 * 1.@SpringBootTest注解指定WebMvcEnvironment为Default
 * 通过TestRestTemplate来访问指定路径
 *
 * 2.@SpringBootTest注解+@AutoConfigureMockMvc方式模拟web环境
 *
 *
 * 注意@SpringbootTest注解中的WebMvcEnvironment是用来控制是否生成web环境和模拟web环境生成以及不生成web环境
 *
 *
 */
@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class TestUserController {
    /*@Autowired
    private TestRestTemplate testRestTemplate;*/

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetUser() throws Exception {
       /* String forObject = testRestTemplate.getForObject("/user/get", String.class);
        Assert.assertEquals("linliangjin", forObject);*/
     mockMvc.perform(MockMvcRequestBuilders.get("/user/get"))
               .andExpect(MockMvcResultMatchers.status().isOk())
               .andExpect(MockMvcResultMatchers.content().string("linliangjing"));
    }
}
