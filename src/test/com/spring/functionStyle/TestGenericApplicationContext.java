package test.com.spring.functionStyle;

import com.spring.functionStyle.User;
import org.junit.Test;
import org.springframework.context.support.GenericApplicationContext;

public class TestGenericApplicationContext {
    @Test
    public void testGenericApplicationContext(){
        //创建GenericApplicationContext对象
        GenericApplicationContext context = new GenericApplicationContext();
        //调用context方法对对象进行注册
        context.refresh();
        context.registerBean(User.class,()->new User());
        context.registerBean("user1",User.class,()->new User());

        //获取注册的对象
        User user = context.getBean("com.spring.functionStyle.User", User.class);
        System.out.println(user);
        User user1 = context.getBean("user1", User.class);
        System.out.println(user1);
    }
}
