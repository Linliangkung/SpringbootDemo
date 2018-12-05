package com.jsako.springboot.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;


/**
 * @Date 2018/10/23
 * @Author LLJ
 * @Description
 */
@Repository
public class UserDao {
    private  final Logger LOGGER= LoggerFactory.getLogger(getClass().getName());
    public void saveUser(Integer id,String name){
        LOGGER.info("save user:"+id+","+name);
    }
}
