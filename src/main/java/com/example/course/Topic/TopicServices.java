package com.example.course.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicServices {
    @Autowired
    private ITopicRepo topicRepo;

    public void addTopic(Topic topic){
        topicRepo.save(topic);
    }

    public Topic getTopic(String Id){
        int ID = Integer.parseInt(Id);
        try {
            return  topicRepo.findById(ID).get();
        }
        catch (Exception e){}
        return null;
    }

    public List<Topic> getAll(){
        List<Topic> topics = new ArrayList<>();
        topicRepo.findAll().forEach(topics :: add);
        return topics;
    }

}
