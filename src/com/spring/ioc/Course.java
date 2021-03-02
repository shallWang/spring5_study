package com.spring.ioc;

public class Course {
    private String courseName;

    public Course(){
        System.out.println("构造方法");
    }

    public Course(String courseName){
        System.out.println("构造方法");
        this.courseName = courseName;
    }

    public void setCourseName(String courseName) {
        System.out.println("set方法");
        this.courseName = courseName;
    }

    public void initMethod(){
        System.out.println("初始方法");
    }

    public void destroyMethod(){
        System.out.println("销毁方法");
    }

    @Override
    public String toString(){
        return courseName;
    }
}
