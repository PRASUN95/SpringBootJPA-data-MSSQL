package com.example.course.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServices {

    @Autowired
    private IStudentRepo studentRepo;

    public void addStudent(Student student){
        studentRepo.save(student);
    }

    public List<Student> getAll(){
        List<Student> students = new ArrayList<>();
        studentRepo.findAll().forEach(students::add);
        return students;
    }

    public Student getStudent(String Id){
        int ID = Integer.parseInt(Id);
        return studentRepo.findById(ID).get();
    }
}
