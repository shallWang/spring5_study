package test.com.spring.ioc;

import com.spring.ioc.Student;
import com.spring.ioc.StudentFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudentFactory {
    @Test
    public void testStudentFactory(){
        ApplicationContext context = new ClassPathXmlApplicationContext("factory.xml");
        Student stu = context.getBean("studentFactory", Student.class);
        stu.display();
    }
}
