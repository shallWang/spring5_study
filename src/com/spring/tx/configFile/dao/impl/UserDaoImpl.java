package com.spring.tx.configFile.dao.impl;

import com.spring.tx.configFile.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void addMoney(String id, double money) {
        String sql = "update account set money=money+? where id=?";
        jdbcTemplate.update(sql,money,id);
    }

    @Override
    public void reduceMoney(String id, double money) {
        String sql = "update account set money=money-? where id=?";
        jdbcTemplate.update(sql,money,id);
    }
}
