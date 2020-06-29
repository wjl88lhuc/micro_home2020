package com.atustb.micro.config;

import com.atustb.micro.model.CurrentTime;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MyApplicationConfig {

   @Bean
    public CurrentTime getCurrentTime(){
       return new CurrentTime();
   }

}
