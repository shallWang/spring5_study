package test.com.spring.ioc;

import com.spring.ioc.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
    @Test
    public void testStudentContainer(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc/container.xml");
        Student stu = context.getBean("student", Student.class);
        stu.display();
    }

    @Test
    public void testStudentContainerNamespace(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc/namespace.xml");
        Student stu = context.getBean("student", Student.class);
        stu.display();
    }

    @Test
    public void testStudentAutowired(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc/autowired.xml");
        Student stu = context.getBean("student", Student.class);
        stu.display();
    }
}
