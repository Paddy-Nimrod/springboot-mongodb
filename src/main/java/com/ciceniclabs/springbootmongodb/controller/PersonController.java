package com.ciceniclabs.springbootmongodb.controller;

import com.ciceniclabs.springbootmongodb.collection.Person;
import com.ciceniclabs.springbootmongodb.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    public String savePerson(@RequestBody Person person){
        return personService.save(person);
    }
}
