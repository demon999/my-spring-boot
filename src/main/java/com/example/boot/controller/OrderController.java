package com.example.boot.controller;

import com.example.boot.entity.Orders;
import com.example.boot.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Richard Xue
 * @version 1.0
 * @date 2019-11-24 20:59
 */
@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderMapper orderMapper;

    @PostMapping
    public String test() {
        Orders orders = new Orders();
        orders.setUserId(1).setNumber("2222222");
        orderMapper.insert(orders);
        return "1";
    }

}
