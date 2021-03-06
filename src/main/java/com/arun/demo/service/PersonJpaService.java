package com.arun.demo.service;

import com.arun.demo.bean.Person;
import com.arun.demo.dao.PersonJpaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonJpaService {

    @Autowired
    private PersonJpaDao personJpaDao;

    public Person findById(int id) {
        return personJpaDao.findById(id);
    }

    public Person updatePerson(Person person) {
        return personJpaDao.updatePerson(person);
    }
}
