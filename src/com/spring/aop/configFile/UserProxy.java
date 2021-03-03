package com.spring.aop.configFile;

import org.aspectj.lang.ProceedingJoinPoint;

public class UserProxy {



    public void before(){
        System.out.println("User before");
    }

    public void after(){
        System.out.println("after");
    }


    public void afterThrowing(){
        System.out.println("afterThrowing");
    }


    public void afterReturning(){
        System.out.println("afterReturning");
    }


    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("before around");
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("after around");
        return obj;
    }


}
