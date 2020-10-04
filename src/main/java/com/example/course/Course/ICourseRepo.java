package com.example.course.Course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ICourseRepo extends CrudRepository<Course, Integer> {
    public List<Course> findByTopicId(Integer topicId);
}
