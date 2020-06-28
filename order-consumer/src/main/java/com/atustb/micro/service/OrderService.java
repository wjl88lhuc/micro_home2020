package com.atustb.micro.service;

import com.alibaba.dubbo.config.annotation.Service;

@Service
public interface OrderService {
    String getAverageCost();
}
