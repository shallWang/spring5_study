package test.com.spring.tx.configFile.service;

import com.spring.tx.comment.entity.User;
import com.spring.tx.comment.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserService {
    @Test
    public void testUserServiceAccountMoneyByComment(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/tx/comment.xml");
        UserService userService = context.getBean("userService", UserService.class);
        User user1 = new User();
        User user2 = new User();
        user1.setId("1");
        user2.setId("2");
        userService.accountMoney(user1,user2,100);
    }

}
