package com.spring.ioc;

public class Course {
    private String courseName;

    public Course(){
        System.out.println("���췽��");
    }

    public Course(String courseName){
        System.out.println("���췽��");
        this.courseName = courseName;
    }

    public void setCourseName(String courseName) {
        System.out.println("set����");
        this.courseName = courseName;
    }

    public void initMethod(){
        System.out.println("��ʼ����");
    }

    public void destroyMethod(){
        System.out.println("���ٷ���");
    }

    @Override
    public String toString(){
        return courseName;
    }
}
