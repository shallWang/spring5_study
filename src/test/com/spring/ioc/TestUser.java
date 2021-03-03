package test.com.spring.ioc;

import com.spring.ioc.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    @Test
    public void testUser(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc/construction.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
        System.out.println(user.getName());
    }

    @Test
    public void testUserComponent(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc/componentScan.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
        System.out.println(user.getName());
    }
}
