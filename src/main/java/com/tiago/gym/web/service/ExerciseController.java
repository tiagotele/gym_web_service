package com.tiago.gym.web.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tiago.gym.web.service.pojos.Exercise;

@Controller
public class ExerciseController {
	@RequestMapping(value = "/exercise", method = RequestMethod.GET)
	public @ResponseBody Exercise get(
			@RequestParam(value = "id", required = false, defaultValue = "1") Long id) {
		Exercise exercise = new Exercise();
		exercise.setName("on get");
		exercise.setTarget("target");
		return exercise;
	}
	
	@RequestMapping(value = "/exercise", method = RequestMethod.DELETE)
	public @ResponseBody String delete(
			@RequestParam(value = "id", required = false, defaultValue = "1") Long id) {
		return "deleted";
	}

	@RequestMapping(value = "/exercise", method = RequestMethod.POST)
	public @ResponseBody Exercise add(
			@RequestBody Exercise exercise) {
		return exercise;
	}
	
	@RequestMapping(value = "/exercise", method = RequestMethod.PUT)
	public @ResponseBody Exercise edit(
			@RequestBody Exercise exercise) {
		return exercise;
	}
}
