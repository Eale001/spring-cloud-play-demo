package com.eale.producer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author Admin
 * @Date 2020/12/18
 * @Description // 服务提供方
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class Producer2Application {

    public static void main(String[] args) {
        SpringApplication.run(Producer2Application.class,args);
    }

}
