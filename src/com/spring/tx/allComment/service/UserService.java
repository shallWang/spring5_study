package com.spring.tx.allComment.service;

import com.spring.tx.allComment.dao.UserDao;
import com.spring.tx.allComment.entity.User;
import com.sun.istack.internal.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserDao userDao;

    public void accountMoney(@NotNull User user1, @NotNull User user2, double money){
        userDao.addMoney(user2.getId(), money);
        int i = 1/0;
        userDao.reduceMoney(user1.getId(),money);
    }
}
