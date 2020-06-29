package com.atustb.micro.service.impl;

import com.atustb.micro.service.OrderServiceNoDb;
import org.apache.dubbo.config.annotation.Service;

import java.util.Date;

@Service
public class OrderServiceNoDbImpl implements OrderServiceNoDb {
    @Override
    public String getDay(Date date) {
        return null;
    }

    @Override
    public String getHost() {
        return "from 7002";
    }


}
