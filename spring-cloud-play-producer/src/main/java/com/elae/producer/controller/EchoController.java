package com.elae.producer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Admin
 * @Date 2021/3/16
 * @Description // EchoController
 * @Version 1.0
 **/
@RestController
@RequestMapping("/echo")
public class EchoController {


    @GetMapping("/echo/{serviceName}")
    public String echo(@PathVariable String serviceName) {
        return "Hello Nacos Discovery " + serviceName;
    }

}
