package com.example.demo.controller;

import com.example.demo.domain.Person;
import com.example.demo.message.EventListener;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private EventListener eventListener;

//    @GetMapping
//    public ResponseEntity saveOnePerson()
//    {
//        eventListener.personRegisteredEventListener();
//    }

}