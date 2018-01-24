package com.arun.demo.mapper;

import com.arun.demo.bean.Person;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonRowMapper implements RowMapper<Person> {
    @Override
    public Person mapRow(ResultSet resultSet, int i) throws SQLException {
        Person person = new Person();
        person.setId(resultSet.getString(1));
        person.setName(resultSet.getString(2));
        person.setLocation(resultSet.getString(3));
        person.setBirth_date(resultSet.getDate(4));
        return person;
    }
}