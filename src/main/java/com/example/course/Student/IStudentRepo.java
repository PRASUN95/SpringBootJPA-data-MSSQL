package com.example.course.Student;

import org.springframework.data.repository.CrudRepository;


public interface IStudentRepo extends CrudRepository<Student, Integer> {

}
