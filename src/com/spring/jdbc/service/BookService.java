package com.spring.jdbc.service;

import com.spring.jdbc.dao.BookDao;
import com.spring.jdbc.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookDao bookDao;

    public void addBook(Book book){
        bookDao.add(book);
    }

    public void batchAddBook(List<Object[]> books){
        bookDao.batchAdd(books);
    }

    public void deleteBook(Book book){
        bookDao.delete(book);
    }

    public void batchDeleteBook(List<Object[]> books){
        bookDao.batchDelete(books);
    }

    public void updateBook(Book book){
        bookDao.update(book);
    }

    public void batchUpdateBook(List<Object[]> books){
        bookDao.batchUpdate(books);
    }

    public int findBookCount(){
        return bookDao.findCount();
    }

    public Book findOneBook(String isbn){
        return bookDao.findOne(isbn);
    }

    public List<Book> findAllByName(String name){
        return bookDao.findAllByName(name);
    }

}
