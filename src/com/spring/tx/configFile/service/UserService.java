package com.spring.tx.configFile.service;

import com.spring.tx.configFile.dao.UserDao;
import com.spring.tx.configFile.entity.User;
import com.sun.istack.internal.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public void accountMoney(@NotNull User user1, @NotNull User user2, double money){
        userDao.addMoney(user2.getId(), money);
        userDao.reduceMoney(user1.getId(),money);
    }
}
