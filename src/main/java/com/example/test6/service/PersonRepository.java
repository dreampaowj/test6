package com.example.test6.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test6.bean.Person;

public interface PersonRepository extends JpaRepository<Person, Person.PersonId> {

}
