package com.spring.tx.comment.dao;

import com.sun.istack.internal.NotNull;
import org.springframework.lang.NonNull;

public interface UserDao {
    void addMoney(@NonNull String id, double money);

    void reduceMoney(@NotNull String id, double money);
}
