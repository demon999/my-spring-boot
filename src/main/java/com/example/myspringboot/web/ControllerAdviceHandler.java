package com.example.myspringboot.web;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ControllerAdviceHandler {

    @ExceptionHandler(Exception.class)
    public Map handleException(Exception e) {
        e.printStackTrace();
        return new HashMap<String, String>(9) {{ put("a" , ""); put("b" , "");}};
    }

}
