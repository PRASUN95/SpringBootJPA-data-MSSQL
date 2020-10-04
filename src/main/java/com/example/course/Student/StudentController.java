package com.example.course.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentServices studentServices;

    @RequestMapping(method = RequestMethod.POST,value = "/student")
    public void addStudent(@RequestBody Student student){
        studentServices.addStudent(student);
    }

    @RequestMapping("/students")
    public List<Student> getAll(){
        return studentServices.getAll();
    }

    @RequestMapping("/students/{Id}")
    public Student get(@PathVariable String Id){
        return studentServices.getStudent(Id);
    }

}
