package com.spring.ioc;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
    private Course[] courses;

    private List<Course> courseList;

    private Set<Course> courseSet;

    private Map<String, Course> courseMap;

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setCourseSet(Set<Course> courseSet) {
        this.courseSet = courseSet;
    }

    public void setCourseMap(Map<String, Course> courseMap) {
        this.courseMap = courseMap;
    }

    public void display(){
        System.out.println(Arrays.toString(courses));
        System.out.println(courseList);
        System.out.println(courseSet);
        System.out.println(courseMap);
    }
}
