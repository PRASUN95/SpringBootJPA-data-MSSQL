package com.example.course.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {
    @Autowired
    private TopicServices topicServices;

    @RequestMapping(method = RequestMethod.POST, value = "/topic")
    public void addTopic(@RequestBody Topic topic){
        topicServices.addTopic(topic);
    }

    @RequestMapping("/topic")
    public List<Topic> getAll(){
        return topicServices.getAll();
    }

    @RequestMapping("/topic/{Id}")
    public Topic getTopic(@PathVariable String Id){
        return topicServices.getTopic(Id);
    }

}
