package com.jsako.springboot.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Date 2018/10/10
 * @Author LLJ
 * @Description
 *
 * Springboot Servlet注册的几种形式
 * 1.通过Servlet3.0特性注册,在Servlet类上加上WebServlet注解,并在配置类加上@ServletComponentScan
 * 2.通过
 */
//@WebServlet("/testServlet")
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("hello servlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
