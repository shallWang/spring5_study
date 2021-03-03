package com.spring.aop.configFile;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class PersonProxy {
    @Before(value = "execution(* com.spring.aop.configFile.User.add())")
    public void before(){
        System.out.println("Person before");
    }
}
