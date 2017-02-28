package com.tiago.gym.web.service.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tiago.gym.web.service.models.Equipment;

@Controller
public class EquipamentController {
	
	private static final String path = "/equipment";
	
	@RequestMapping(value= path, method = RequestMethod.GET)
	public @ResponseBody Equipment get(
			@RequestParam(value = "id", required = true, defaultValue = "1") Long id) {
		Equipment equipment = new Equipment();
		equipment.setMachineNumber(30);
		equipment.setName("supino");
		return equipment;
	}
	
	@RequestMapping(value= path, method = RequestMethod.DELETE)
	public @ResponseBody Equipment delete(
			@RequestParam(value = "id", required = true, defaultValue = "1") Long id) {
		Equipment equipment = new Equipment();
		equipment.setMachineNumber(40);
		equipment.setName("rosca scott");
		return equipment;
	}
	
	@RequestMapping(value = path, method = RequestMethod.POST)
	public @ResponseBody Equipment add(
			@RequestBody Equipment equipment) {
		return equipment;
	}
	
	@RequestMapping(value = path, method = RequestMethod.PUT)
	public @ResponseBody Equipment edit(
			@RequestBody Equipment equipment) {
		return equipment;
	}
}
