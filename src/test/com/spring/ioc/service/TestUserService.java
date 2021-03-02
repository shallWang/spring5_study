package test.com.spring.ioc.service;
import com.spring.ioc.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserService {
    @Test
    public void testUserService(){
        ApplicationContext context = new ClassPathXmlApplicationContext("construction.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.update();
    }
}
