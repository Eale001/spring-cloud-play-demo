package com.eale.consumer1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author Admin
 * @Date 2020/12/17
 * @Description // 消费1
 * @Version 1.0
 **/
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class Consumer1Application {

    public static void main(String[] args) {
        SpringApplication.run(Consumer1Application.class,args);
    }
}
