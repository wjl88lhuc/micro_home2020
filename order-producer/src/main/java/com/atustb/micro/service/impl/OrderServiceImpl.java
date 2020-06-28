package com.atustb.micro.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atustb.micro.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public String getAverageCost() {
        return "美国";
    }

}
