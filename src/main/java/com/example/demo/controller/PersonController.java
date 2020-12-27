package com.example.demo.controller;

import com.example.demo.message.EventListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private EventListener eventListener;

//    @GetMapping
//    public ResponseEntity saveOnePerson()
//    {
//        eventListener.personRegisteredEventListener();
//    }

}