package com.arun.demo.dao;

import com.arun.demo.bean.Person;
import com.arun.demo.mapper.PersonRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonJDBCDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public List<Person> findAll() {
        return jdbcTemplate.query("SELECT * FROM person", new PersonRowMapper());
    }

    public Person findById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM person WHERE id = ?", new Object[]{id}, new PersonRowMapper());
    }

    public String deleteById(int id) {
        int rowsDeleted = jdbcTemplate.update("DELETE FROM person WHERE id= ?", new Object[]{id});
        return rowsDeleted > 0 ? "Successful" : "Failed";
    }


    public int insertPerson(Person person) {
        return jdbcTemplate.update("INSERT INTO person (id,name,location,birth_date)VALUES(?,?,?,?)",
                new Object[]{
                        person.getId(), person.getName(), person.getLocation(), person.getBirth_date()});
    }
}
