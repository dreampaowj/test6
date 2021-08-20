package com.example.test6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.test6.service.PersonRepository;

@RestController
public class PersonController {
	@Autowired
	PersonRepository personRepository;
}
