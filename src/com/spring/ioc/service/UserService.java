package com.spring.ioc.service;

import com.spring.ioc.dao.UserDao;

public class UserService {
    //�������ļ���ע��
    UserDao userDao;
    public void update(){
        userDao.update();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
