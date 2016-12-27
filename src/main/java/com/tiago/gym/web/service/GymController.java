package com.tiago.gym.web.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GymController {
	String message = "Welcome to Gym ";

	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "Tiago") String name) {

		ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}

	@RequestMapping(value = "/person", method = RequestMethod.GET)
	public @ResponseBody Person getPerson(
			@RequestParam(value = "name", required = false, defaultValue = "Tiago") String name,
			@RequestParam(value = "age", required = false, defaultValue = "30") Integer age) {
		System.out.println("in the get");
		return new Person(name, age);
	}

	@RequestMapping(value = "/person", method = RequestMethod.POST)
	public @ResponseBody Person getPersonPost(
			@RequestParam(value = "name", required = false, defaultValue = "Tiago") String name,
			@RequestParam(value = "age", required = false, defaultValue = "30") Integer age) {
		System.out.println("in the post");
		return new Person(name, age);
	}

}
