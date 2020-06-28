package com.atustb.micro.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atustb.micro.dao.OrderDao;
import com.atustb.micro.model.Order;
import com.atustb.micro.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public Integer create(Order order) {
        System.out.println("====被调用了====");
        return orderDao.create(order);
    }
}
