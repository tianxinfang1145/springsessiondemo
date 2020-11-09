package com.offcn.springsessiondemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class TestController {
    @GetMapping("/set")
    public String setSession(HttpSession session){
        session.setAttribute("msg","中公教育总部");
        return "OK";
    }

    @GetMapping("/get")
    public String getSession(HttpSession session){
        System.out.println("github123");
         System.out.println("你好呀");
        System.out.println("我很好呀");
        return (String)session.getAttribute("msg");
    }
}
