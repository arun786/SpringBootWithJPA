package com.arun.demo.controller;

import com.arun.demo.bean.Person;
import com.arun.demo.service.PersonJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonJpaController {

    @Autowired
    private PersonJpaService personJpaService;

    @GetMapping(value = "/jpa/find/{id}")
    public Person findById(@PathVariable final String id) {
        return personJpaService.findById(id);
    }
}
