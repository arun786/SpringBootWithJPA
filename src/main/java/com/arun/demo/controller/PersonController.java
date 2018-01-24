package com.arun.demo.controller;

import com.arun.demo.bean.Person;
import com.arun.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/person/all")
    public List<Person> getAll() {
        return personService.findAll();
    }

    @GetMapping("/person/{id}")
    public Person findById(@PathVariable final int id) {
        return personService.findById(id);
    }

    @DeleteMapping("person/delete/{id}")
    public String deleteById(@PathVariable int id) {
        return personService.deleteById(id);
    }

    @PostMapping("person/insert/")
    public int insertPerson(@RequestBody Person person) {
        return personService.insertPerson(person);
    }
}
