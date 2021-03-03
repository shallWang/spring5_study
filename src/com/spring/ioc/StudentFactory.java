package com.spring.ioc;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentFactory implements FactoryBean<Student> {
    @Override
    public Student getObject() throws Exception {
        return new ClassPathXmlApplicationContext("ioc/container.xml").getBean("student", Student.class);
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
