package com.springboot.apitesting;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImple implements CourseService{

    List<Course> list;

    public CourseServiceImple(){

        list = new ArrayList<>();

        list.add(new Course(145, "Core Java", "This is complete core java course"));
        list.add(new Course(4343, "Spring Boot", "This is complete Spring Boot course"));

    }



    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(long courseId){
        Course c = null;
        for (Course course: list){
            if (course.getId()==courseId){
                c = course;
                break;
            }
        }

        return c;
    }

    @Override
    public Course addCourse(Course course){
        list.add(course);
        return course;
    }

}
