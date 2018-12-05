package com.jsako.springboot.controller;

import com.jsako.springboot.dao.UserDao;
import com.jsako.springboot.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date 2018/12/5
 * @Author LLJ
 * @Description
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserDao userDao;


    @RequestMapping("/get")
    public String getUser(){
        return "linliangjin";
    }

}
