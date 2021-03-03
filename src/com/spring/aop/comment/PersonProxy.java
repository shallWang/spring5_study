package com.spring.aop.comment;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class PersonProxy {
    @Before(value = "execution(* com.spring.aop.comment.User.add())")
    public void before(){
        System.out.println("Person before");
    }
}
