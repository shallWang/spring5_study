package com.spring.ioc.service;

import com.spring.ioc.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    //在配置文件中注入
    @Autowired
            //Autowired根据类型注入
            // Qualifier根据名称注入
            // Resource可以类型或名称注入
            // Resource根据类型
            // Resource(name="")根据名称
            // value注入普通类型
    UserDao userDao;
    public void update(){
        userDao.update();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
