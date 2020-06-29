package com.atustb.micro.service.impl;


import com.atustb.micro.service.OrderServiceNoDb;
import org.apache.dubbo.config.annotation.Service;

import java.util.Calendar;
import java.util.Date;

@Service
public class OrderServiceNoDbImpl implements OrderServiceNoDb {
    @Override
    public String getDay(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return String.valueOf(cal.get(Calendar.DAY_OF_WEEK));
    }

    @Override
    public String getHost() {
        return "from the 7001";
    }
}
