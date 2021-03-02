package com.spring.ioc.service;

import com.spring.ioc.dao.UserDao;

public class UserService {
    //在配置文件中注入
    UserDao userDao;
    public void update(){
        userDao.update();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
