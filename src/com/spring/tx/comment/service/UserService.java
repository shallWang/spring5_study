package com.spring.tx.comment.service;

import com.spring.tx.comment.dao.UserDao;
import com.spring.tx.comment.entity.User;
import com.sun.istack.internal.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
//添加事务
//可以添加属性
/*
propagation 事务传播行为
isolation   事务隔离级别
timeout     超过时间
readOnly    是否只读
rollbackFor 回滚

 */
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
