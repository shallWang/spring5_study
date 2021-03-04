package test.com.spring.tx.allComment.service;

import com.spring.tx.allComment.config.TxConfig;
import com.spring.tx.allComment.entity.User;
import com.spring.tx.allComment.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUserService {
    @Test
    public void testUserServiceAccountMoneyByComment(){
        ApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        User user1 = new User();
        User user2 = new User();
        user1.setId("1");
        user2.setId("2");
        userService.accountMoney(user1,user2,100);
    }

}
