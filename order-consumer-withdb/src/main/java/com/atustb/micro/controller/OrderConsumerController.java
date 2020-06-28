package com.atustb.micro.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atustb.micro.model.Order;
import com.atustb.micro.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderConsumerController {

    @Reference(group ="orderdb",version ="1" )
    private OrderService orderService;

    @GetMapping("/consumer/order/create")
    public String createOrder(Order order){
        System.out.println("==传入进来的order===" + order);
        return orderService.create(order) > 0 ? "成功": "失败";
    }



}
