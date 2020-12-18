package com.eale.producer2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xbcx.common.core.response.Result;

/**
 * @Author Admin
 * @Date 2020/12/18
 * @Description //
 * @Version 1.0
 **/
@RestController
@RequestMapping("/producer2")
public class Producer2Controller {


    @Value("${neo.hello}")
    private String hello;

    public Result hello(){
        return Result.success(hello);
    }

}
