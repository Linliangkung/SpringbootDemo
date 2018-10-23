package com.jsako.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date 2018/10/23
 * @Author LLJ
 * @Description
 */
@RestController
@RequestMapping("/api/my")
public class MyController {
    @Autowired
    private CounterService counterService;

    @RequestMapping("/countAccess")
    public String countAccess(){
        counterService.increment("countAccess");
        return "success";
    }
}
