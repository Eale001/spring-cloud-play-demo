package com.eale.consumer1.controller;

import com.eale.consumer1.remote.CloudProducerRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author Admin
 * @Date 2020/12/17
 * @Description // 消费者接口1
 * @Version 1.0
 **/
@RestController
public class ConsumerFeignController {

    @Autowired
    CloudProducerRemote cloudProducerRemote;

    @GetMapping("/hello")
    public String test(String hello){

        return cloudProducerRemote.hello(hello);
    }

    @PostMapping("/addOrder")
    public String addOrder(@RequestBody Map<String,Object> map){

        return cloudProducerRemote.addOrder(map);
    }



}
