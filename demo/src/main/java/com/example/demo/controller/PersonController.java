package com.example.demo.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.GreetingConfiguration;
import com.example.demo.model.Person;

@RestController
public class PersonController {
	
	private static final String template = "%s, %s!";
	private GreetingConfiguration configuration;
	
	public PersonController(GreetingConfiguration configuration) {
		this.configuration = configuration;
	}

	@RequestMapping("/person")
	public Person helloWorld(
			@RequestParam(value = "name",
			defaultValue = "World") String name) {
		
		if(name.isEmpty()) {
			name = configuration.getDefaultValue();
		}
		
		return new Person(
				UUID.randomUUID(),
				String.format(template, configuration.getName(), name));
	}
}
