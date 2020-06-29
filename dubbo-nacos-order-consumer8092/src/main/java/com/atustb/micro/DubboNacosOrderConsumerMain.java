package com.atustb.micro;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class DubboNacosOrderConsumerMain {
    public static void main(String[] args) {
        SpringApplication.run(DubboNacosOrderConsumerMain.class,args);
    }
}
