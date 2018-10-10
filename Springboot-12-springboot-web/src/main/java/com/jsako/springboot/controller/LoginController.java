package com.jsako.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Date 2018/10/8
 * @Author LLJ
 * @Description
 */
@Controller
@RequestMapping("/api/auth")
public class LoginController {


    @PostMapping("/login")
    public String login(@RequestParam("username")String username,@RequestParam("password")String password){
        if(username.equals("linliangjin")&&password.equals("linliangjin123")){
            return "success";
        }else{
            return "fail";
        }
    }

    @GetMapping("/login")
    public String loginPage(Model model){
        model.addAttribute("username","林良劲");
        return "loginPage";
    }
}
