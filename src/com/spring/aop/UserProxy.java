package com.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.junit.Test;
import org.springframework.stereotype.Component;

//��ǿ��
@Component
@Aspect
public class UserProxy {
    //������ȡ
    @Pointcut(value = "execution(* com.spring.aop.User.add())")
    public void pointDemo(){}

    //ǰ��֪ͨ
    @Before(value = "pointDemo()")
    public void before(){
        System.out.println("before");
    }

    //����֪ͨ�����쳣ִ�У�
    @After(value = "pointDemo()")
    public void after(){
        System.out.println("after");
    }

    //�쳣֪ͨ
    @AfterThrowing(value = "pointDemo()")
    public void afterThrowing(){
        System.out.println("afterThrowing");
    }

    //����֪ͨ�����쳣��ִ�У�
    @AfterReturning(value = "pointDemo()")
    public void afterReturning(){
        System.out.println("afterReturning");
    }

    //����֪ͨ
    @Around(value = "pointDemo()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("before around");
        proceedingJoinPoint.proceed();
        System.out.println("after around");
    }


}
