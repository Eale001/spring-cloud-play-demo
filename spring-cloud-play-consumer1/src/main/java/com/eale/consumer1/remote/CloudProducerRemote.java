package com.eale.consumer1.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @Author Admin
 * @Date 2020/12/17
 * @Description // 远程调用
 * @Version 1.0
 **/
@FeignClient(name = "cloud-producer",fallback = CloudProducerRemoteHystrix.class)
public interface CloudProducerRemote {

    @GetMapping("/hello/test")
    public String hello(@RequestParam("name") String name);

    @PostMapping("/order/add")
    public String addOrder(@RequestBody Map<String,Object> map);


}
