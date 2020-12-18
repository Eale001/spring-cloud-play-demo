package com.elae.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.commons.util.InetUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.xbcx.common.core.response.Result;


/**
 * @Author Admin
 * @Date 2020/12/17
 * @Description // 服务提供方
 * @Version 1.0
 **/
@RestController
@RequestMapping("/hello")
public class HelloController {

//    @Value("${neo.hello}")
//    private String hello;

    @Autowired
    private InetUtils inetUtils;

    @GetMapping("/test")
    public Result hello(@RequestParam("name") String name){
        System.out.println(name+"请求我了！");

        String result = "this is a producer " + name + " "+ inetUtils.findFirstNonLoopbackHostInfo().getIpAddress();

        return Result.success(result);
    }


/*    @GetMapping("/hello")
    public Result hello(){
        String result = "this is a producer " + hello + " "+ inetUtils.findFirstNonLoopbackHostInfo().getIpAddress();
        return Result.success(result);
    }*/


}
