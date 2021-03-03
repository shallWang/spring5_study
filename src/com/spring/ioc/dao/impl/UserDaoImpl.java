package com.spring.ioc.dao.impl;

import com.spring.ioc.dao.UserDao;
import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements UserDao {
    @Override
    public void update() {
        System.out.println("update");
    }
}
