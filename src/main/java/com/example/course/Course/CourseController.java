package com.example.course.Course;

import com.example.course.Topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseServices courseServices;

    @RequestMapping("/topic/{Id}/course")
    public  List<Course> getAllCourses(@PathVariable String Id){
        return courseServices.getCourses(Id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topic/{Id}/course")
    public void addCourse(@RequestBody Course course, @PathVariable String Id){
        course.setTopic(new Topic(Integer.parseInt(Id),"",""));
        courseServices.add(course);
    }
}
