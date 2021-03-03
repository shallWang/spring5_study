package com.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.junit.Test;
import org.springframework.stereotype.Component;

//增强类
@Component
@Aspect
public class UserProxy {
    //切入点抽取
    @Pointcut(value = "execution(* com.spring.aop.User.add())")
    public void pointDemo(){}

    //前置通知
    @Before(value = "pointDemo()")
    public void before(){
        System.out.println("before");
    }

    //最终通知（有异常执行）
    @After(value = "pointDemo()")
    public void after(){
        System.out.println("after");
    }

    //异常通知
    @AfterThrowing(value = "pointDemo()")
    public void afterThrowing(){
        System.out.println("afterThrowing");
    }

    //后置通知（有异常不执行）
    @AfterReturning(value = "pointDemo()")
    public void afterReturning(){
        System.out.println("afterReturning");
    }

    //环绕通知
    @Around(value = "pointDemo()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("before around");
        proceedingJoinPoint.proceed();
        System.out.println("after around");
    }


}
