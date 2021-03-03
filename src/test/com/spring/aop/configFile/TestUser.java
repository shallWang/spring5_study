package test.com.spring.aop.configFile;

import com.spring.aop.comment.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    @Test
    public void testUser(){
        ApplicationContext context = new ClassPathXmlApplicationContext("aop/config.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }
}
