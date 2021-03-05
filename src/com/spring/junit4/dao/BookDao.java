package com.spring.junit4.dao;

import com.spring.junit4.Book;

import java.util.List;


public interface BookDao {
    void add(Book book);
    //批量添加
    void batchAdd(List<Object[]> books);
    void delete(Book book);
    void batchDelete(List<Object[]> books);
    void update(Book book);
    void batchUpdate(List<Object[]> books);
    int findCount();
    Book findOne(String isbn);
    List<Book> findAllByName(String name);
}
