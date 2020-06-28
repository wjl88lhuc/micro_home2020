package com.atustb.micro;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class OrderProviderWithdbMain {
    public static void main(String[] args) {
        SpringApplication.run(OrderProviderWithdbMain.class,args);
    }
}
