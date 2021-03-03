package test.com.spring.ioc.service;
import com.spring.ioc.config.SpringConfig;
import com.spring.ioc.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserService {
    @Test
    public void testUserService(){
        ApplicationContext context = new ClassPathXmlApplicationContext("construction.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.update();
    }

    @Test
    public void testUserServiceAutowire(){
        ApplicationContext context = new ClassPathXmlApplicationContext("componentScan.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.update();
    }

    @Test
    public void testUserServiceConfigClass(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.update();
    }


}
