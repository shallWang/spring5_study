package test.com.spring.junit4;

import com.spring.junit4.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//指定单元测试框架
@ContextConfiguration("classpath:junit4/jdbc.xml")//加载配置文件
public class TestBook {
    @Autowired
    private BookService bookService;

    @Test
    public void test(){
        System.out.println(bookService.findBookCount());
    }
}
