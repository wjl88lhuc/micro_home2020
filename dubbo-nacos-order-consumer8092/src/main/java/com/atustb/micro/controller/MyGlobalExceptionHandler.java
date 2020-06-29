package com.atustb.micro.controller;

import com.atustb.micro.model.CurrentTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;

@ControllerAdvice
public class MyGlobalExceptionHandler {

    @Autowired
    private CurrentTime currentTime;

    @ExceptionHandler(ParseException.class)
    @ResponseBody
    public String getDayException(Exception e ){
        System.out.println("========代码走异常处理阶段==========");
        return currentTime.getCurrentDayOfWeek();
    }
}
