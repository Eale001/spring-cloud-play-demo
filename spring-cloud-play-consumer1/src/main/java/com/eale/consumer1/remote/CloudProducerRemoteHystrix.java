package com.eale.consumer1.remote;

import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Author Admin
 * @Date 2020/12/17
 * @Description // 订单熔断
 * @Version 1.0
 **/
@Component
public class CloudProducerRemoteHystrix implements CloudProducerRemote{

    @Override
    public String addOrder(Map<String, Object> map) {
        return "这一单添加失败了: "+ map.toString() + " ，等哈子重新添加！";
    }

    @Override
    public String hello(String name) {
        return null;
    }
}
