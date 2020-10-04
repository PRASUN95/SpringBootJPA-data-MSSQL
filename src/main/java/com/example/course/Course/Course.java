package com.example.course.Course;

import com.example.course.Topic.Topic;

import javax.persistence.*;

@Entity
@Table(name = "APP_COURSE")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;

    @ManyToOne(optional = false)
    @JoinColumn(name = "topic_id", referencedColumnName = "Id")
    private Topic topic;

    public Course() {

    }

    public Course(String name, String description) {
        super();
        this.name = name;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}
