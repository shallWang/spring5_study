package com.spring.aop.configFile;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


public class PersonProxy {
    public void before(){
        System.out.println("Person before");
    }
}
