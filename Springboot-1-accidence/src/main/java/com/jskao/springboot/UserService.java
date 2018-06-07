package com.jskao.springboot;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {
//	@Autowired
//	@Qualifier("createUserDao")
	@Resource(name="createUserDao")
	private UserDao userDao;
	
	
	public void serivce(){
		System.out.println(userDao);
	}
	
}
