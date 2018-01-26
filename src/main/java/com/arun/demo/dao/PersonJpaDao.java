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

    /**
     *
     * @param id
     * @return
     * To get Data based on an Id.
     */
    public Person findById(int id) {
        return entityManager.find(Person.class, id);
    }

    /**
     * @param person
     * @return To update a Person, we need to send the Person details with existing ID
     */
    public Person updatePerson(Person person) {
        return entityManager.merge(person);
    }

}
