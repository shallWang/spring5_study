package test.com.spring.ioc;

import com.spring.ioc.Course;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCourse {
    @Test
    public void testCourse(){
        ApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
        System.out.println("获取实例");
        Course course = context.getBean("course1", Course.class);
        ((ClassPathXmlApplicationContext)context).close();
    }
}
