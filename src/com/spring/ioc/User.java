package com.spring.ioc;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//value���Բ�д
//�ȼ���bean�е�id
//Ĭ��������������ĸСд
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
