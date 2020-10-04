package com.example.course.Student;

import javax.persistence.*;

@Entity
@Table(name = "APP_STUDENT")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String Name;
    private int Age;

    public  Student(){

    }

    public Student(int id, String name, int age) {
        this.Id = id;
        this.Name = name;
        this.Age = age;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }

}
