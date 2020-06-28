package com.atustb.micro.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atustb.micro.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderConsumer1Controller {

    @Reference(group ="order",version ="1" )
    private OrderService orderService;

    @GetMapping(value = {"/order/consumer/const/average"})
    public String getAverageCost(){
        System.out.println("请求进来了");
        return orderService.getAverageCost();
    }


}
