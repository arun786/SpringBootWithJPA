package com.arun.demo.dao;

import com.arun.demo.bean.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class PersonJpaDao {

    /**
     * To connect to the database, we require an Entity Manager
     */
    @PersistenceContext
    EntityManager entityManager;

    public Person findById(String id) {
        return entityManager.find(Person.class, id);
    }

}
