package com.example.demo.message;

import com.example.demo.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class EventListener {

    @KafkaListener(topics = "person-register",containerFactory = "kafkaListenerContainerFactory")
    public Person personRegisteredEventListener(Person person)
    {
        System.out.println("received");
        person.setListenDate(new Date());
        return person;
    }
}
