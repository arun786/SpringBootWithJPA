package com.arun.demo.service;

import com.arun.demo.bean.Person;
import com.arun.demo.dao.PersonJDBCDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonJDBCDao personJDBCDao;

    public List<Person> findAll() {
        return personJDBCDao.findAll();
    }

    public Person findById(int id) {
        return personJDBCDao.findById(id);
    }

    public String deleteById(int id) {
        return personJDBCDao.deleteById(id);
    }

    public int insertPerson(Person person) {
        return personJDBCDao.insertPerson(person);
    }
}
