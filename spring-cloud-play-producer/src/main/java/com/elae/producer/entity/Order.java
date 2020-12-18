package com.elae.producer.entity;

import lombok.Data;

/**
 * @Author Admin
 * @Date 2020/12/17
 * @Description // 订单
 * @Version 1.0
 **/
@Data
public class Order {

    private Integer id;

    private Integer count;

    private String username;

    private Integer money;

}
