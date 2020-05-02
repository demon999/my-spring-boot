package com.example.boot.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Richard Xue
 * @version 1.0
 * @date 2019-10-30 23:39
 */
@Component
@Aspect
public class AopUtils {

    @Pointcut("execution(* com.example.boot.service..*(..))")
    public void exe(){}

    @Before("exe()")
    public void before() {
        System.out.println("AopUtils>>>>>>");
    }

}
