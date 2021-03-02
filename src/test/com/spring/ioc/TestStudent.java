package test.com.spring.ioc;

import com.spring.ioc.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
    @Test
    public void testStudentContainer(){
        ApplicationContext context = new ClassPathXmlApplicationContext("container.xml");
        Student stu = context.getBean("student", Student.class);
        stu.display();
    }

    @Test
    public void testStudentContainerNamespce(){
        ApplicationContext context = new ClassPathXmlApplicationContext("namespace.xml");
        Student stu = context.getBean("student", Student.class);
        stu.display();
    }

    @Test
    public void testStudentAutowired(){
        ApplicationContext context = new ClassPathXmlApplicationContext("autowired.xml");
        Student stu = context.getBean("student", Student.class);
        stu.display();
    }
}
