package com.atustb.micro;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class DubboNacosOrderProvider7002Main {
    public static void main(String[] args) {
        SpringApplication.run(DubboNacosOrderProvider7002Main.class,args);
    }
}
