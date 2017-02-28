package com.tiago.gym.web.service.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tiago.gym.web.service.models.Person;

@Controller
public class PersonController {
	
	private static final String path = "/person";
	
	@RequestMapping(value = path , method = RequestMethod.GET)
	public @ResponseBody Person get(@RequestParam(value = "id", required = true, defaultValue = "1")Long id){
		Person person = new Person();
		person.setAge(31);
		person.setName("Tiago Barbosa Melo");
		return person;
	}
	
	@RequestMapping(value = path , method = RequestMethod.DELETE)
	public @ResponseBody String delete(@RequestParam(value = "id", required = true, defaultValue = "1")Long id){
		return "Deleted";
	}
	
	@RequestMapping(value = path , method = RequestMethod.POST)
	public @ResponseBody Person add(@RequestBody Person person){
		return person;
	}
	
	@RequestMapping(value = path , method = RequestMethod.PUT)
	public @ResponseBody Person edit(@RequestBody Person person){
		return person;
	}
}
