package com.spring.ioc;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//value可以不写
//等价于bean中的id
//默认是类名的首字母小写
@Service(value = "user")
public class User {
    private String name;

    public User(){
        name=null;
    }

    public User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
