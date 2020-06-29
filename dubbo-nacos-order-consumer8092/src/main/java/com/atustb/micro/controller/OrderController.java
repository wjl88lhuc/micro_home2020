package com.atustb.micro.controller;

import com.atustb.micro.model.CurrentTime;
import com.atustb.micro.service.OrderServiceNoDb;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class OrderController {

    @Reference
    private OrderServiceNoDb orderServiceNoDb;

    @Resource
    private CurrentTime currentTime;

    @GetMapping(value = "/boot/dubbo/order/get/day")
    public String getDay( String year, String month, String dd){
        Date date = null;
        try {
            String dateString = new StringBuffer().append(year).append("-").append(month).append("-").append(dd).toString();
            System.out.println("dateString : " + dateString);
            date = new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
        } catch (ParseException e) {
            System.out.println("=======代码走这里了吗=======");
            e.printStackTrace();
        }
        return orderServiceNoDb.getDay(date);
    }


    @GetMapping("/boot/dubbo/get/host")
    public String getHostName(){
        return orderServiceNoDb.getHost();
    }


}
