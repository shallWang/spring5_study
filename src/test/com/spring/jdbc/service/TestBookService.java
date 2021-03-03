package test.com.spring.jdbc.service;

import com.spring.jdbc.entity.Book;
import com.spring.jdbc.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestBookService {

    @Test
    public void testBookServiceAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/jdbc/jdbc.xml");

        BookService bookService = context.getBean("bookService", BookService.class);
        Book  book = new Book();
        book.setIsbn("123");
        book.setName("九阴真经");
        bookService.addBook(book);
    }
    @Test
    public void testBookServiceBatchAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/jdbc/jdbc.xml");

        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> list = new ArrayList<>();
        Object[] objects1 = {"九阳真经","001"};
        Object[] objects2 = {"九阴真经","002"};
        Object[] objects3 = {"葵花宝典","003"};
        Object[] objects4 = {"辟邪剑法","004"};
        list.add(objects1);
        list.add(objects2);
        list.add(objects3);
        list.add(objects4);
        bookService.batchAddBook(list);
    }
    @Test
    public void testBookServiceDelete(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/jdbc/jdbc.xml");

        BookService bookService = context.getBean("bookService", BookService.class);
        Book  book = new Book();
        book.setIsbn("123456");
        book.setName("九阴真经");
        bookService.deleteBook(book);
    }
    @Test
    public void testBookServiceBatchDelete(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/jdbc/jdbc.xml");

        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> list = new ArrayList<>();
        Object[] objects1 = {"001"};
        Object[] objects2 = {"002"};
        Object[] objects3 = {"003"};
        Object[] objects4 = {"004"};
        list.add(objects1);
        list.add(objects2);
        list.add(objects3);
        list.add(objects4);
        bookService.batchDeleteBook(list);
    }
    @Test
    public void testBookServiceUpdate(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/jdbc/jdbc.xml");

        BookService bookService = context.getBean("bookService", BookService.class);
        Book  book = new Book();
        book.setIsbn("123456");
        book.setName("九阳真经");
        bookService.updateBook(book);
    }
    @Test
    public void testBookServiceBatchUpdate(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/jdbc/jdbc.xml");

        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> list = new ArrayList<>();
        Object[] objects1 = {"C++","001"};
        Object[] objects2 = {"C++","002"};
        Object[] objects3 = {"C++","003"};
        Object[] objects4 = {"C++","004"};
        list.add(objects1);
        list.add(objects2);
        list.add(objects3);
        list.add(objects4);
        bookService.batchUpdateBook(list);
    }
    @Test
    public void testBookServiceFindCount(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/jdbc/jdbc.xml");

        BookService bookService = context.getBean("bookService", BookService.class);
        System.out.println(bookService.findBookCount());
    }
    @Test
    public void testBookServiceFindOne(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/jdbc/jdbc.xml");

        BookService bookService = context.getBean("bookService", BookService.class);
        System.out.println(bookService.findOneBook("123456"));
    }

    @Test
    public void testBookServiceFindAllByName(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/jdbc/jdbc.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        System.out.println(bookService.findAllByName("C++"));
    }


}
