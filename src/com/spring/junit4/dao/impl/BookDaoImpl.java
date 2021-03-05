package com.spring.junit4.dao.impl;

import com.spring.junit4.Book;
import com.spring.junit4.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void add(Book book) {
        String sql = "insert into book value(?,?)";
        jdbcTemplate.update(sql,book.getName(), book.getIsbn());
    }

    @Override
    public void batchAdd(List<Object[]> books) {
        String sql = "insert into book value(?,?)";
        jdbcTemplate.batchUpdate(sql,books);
    }

    @Override
    public void delete(Book book) {
        String sql = "delete from book where isbn=?";
        jdbcTemplate.update(sql, book.getIsbn());
    }

    @Override
    public void batchDelete(List<Object[]> books) {
        String sql = "delete from book where isbn=?";
        jdbcTemplate.batchUpdate(sql,books);
    }

    @Override
    public void update(Book book) {
        String sql = "update book set name=? where isbn=?";
        jdbcTemplate.update(sql,book.getName(), book.getIsbn());
    }

    @Override
    public void batchUpdate(List<Object[]> books) {
        String sql = "update book set name=? where isbn=?";
        jdbcTemplate.batchUpdate(sql,books);
    }

    @Override
    public int findCount() {
        String sql = "select count(*) from book";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @Override
    public Book findOne(String isbn) {
        String sql = "select * from book where isbn = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), isbn);
    }

    @Override
    public List<Book> findAllByName(String name) {
        String sql = "select * from book where name=?";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class),name);
    }
}
