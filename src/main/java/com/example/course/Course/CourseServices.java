package com.example.course.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServices {
    @Autowired
    private ICourseRepo courseRepo;

    public List<Course> getCourses(String topicId){
        List<Course> courses = new ArrayList<Course>();
        courseRepo.findByTopicId(Integer.parseInt(topicId)).forEach(courses::add);
        return courses;
    }

    public void add(Course course){
        courseRepo.save(course);
    }
}
