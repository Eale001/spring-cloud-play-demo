package com.elae.producer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author Admin
 * @Date 2020/12/17
 * @Description // 服务提供方
 * @Version 1.0
 **/
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/test")
    public String hello(@RequestParam("name") String name){
        System.out.println(name+"请求我了！");
        return "this is a producer " + name;
    }


}
