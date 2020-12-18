package com.elae.producer.controller;

import com.elae.producer.entity.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.commons.util.InetUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xbcx.common.core.response.Result;

import java.util.Map;
import java.util.Random;

/**
 * @Author Admin
 * @Date 2020/12/17
 * @Description //订单接口
 * @Version 1.0
 **/
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {


    @Autowired
    private InetUtils inetUtils;

    @PostMapping("/add")
    public Result addOrder(@RequestBody Map<String,Object> map){
        Order order = new Order();
        order.setId(new Random().nextInt(100));
        order.setCount((Integer) map.get("count"));
        order.setMoney((Integer) map.get("money"));
        order.setUsername((String) map.get("username"));
        log.info("新增订单：{} ",order.toString());
        return Result.success(order,inetUtils.findFirstNonLoopbackHostInfo().getIpAddress());
    }


}
