package com.tiago.gym.web.service.controllers;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tiago.gym.web.service.models.Equipment;
import com.tiago.gym.web.service.models.Exercise;
import com.tiago.gym.web.service.models.Goal;
import com.tiago.gym.web.service.models.Person;
import com.tiago.gym.web.service.models.TrainningGroup;
import com.tiago.gym.web.service.models.TrainningPlan;

@Controller
public class TrainningPlanController {
	
	private static final String path = "trainning";

	@RequestMapping(value = path, method = RequestMethod.GET)
	public @ResponseBody TrainningPlan get(@RequestParam(value = "id", required = true, defaultValue = "1")Long id){
		return generateTrainningPlan();
	}
	
	@RequestMapping(value = path, method = RequestMethod.DELETE)
	public @ResponseBody TrainningPlan delete(@RequestParam(value = "id", required = true, defaultValue = "1")Long id){
		return generateTrainningPlan();
	}
	
	@RequestMapping(value = path, method = RequestMethod.POST)
	public @ResponseBody TrainningPlan add(@RequestBody TrainningPlan trainningPlan){

		return trainningPlan;
	}
	
	@RequestMapping(value = path, method = RequestMethod.PUT)
	public @ResponseBody TrainningPlan edit(@RequestBody TrainningPlan trainningPlan){

		return trainningPlan;
	}

	private TrainningPlan generateTrainningPlan() {
		
		Person person = new Person();
		person.setAge(20);
		person.setGoal(Goal.LOSE_WEIGHT);
		person.setName("Fulana");
		
		Equipment supinoBed = new Equipment();
		supinoBed.setMachineNumber(90);
		supinoBed.setName("supino bed");
		
		Equipment floor = new Equipment();
		floor.setMachineNumber(80);
		floor.setName("supino bed");
		
		Exercise supino = new Exercise();
		supino.setName("supino");
		supino.setTarget("chest");
		supino.setEquipment(supinoBed);
		
		Exercise abs = new Exercise();
		abs.setName("abs");
		abs.setTarget("abs");
		abs.setEquipment(floor);
		
		TrainningGroup trainningGroup =  new TrainningGroup();
		trainningGroup.setId(6L);
		trainningGroup.setExercisesSet(new HashSet<Exercise>(Arrays.asList(supino, abs)));
		
		TrainningPlan trainningPlan = new TrainningPlan();
		trainningPlan.setId(5L);
		trainningPlan.setTrainningGroups(new HashSet<TrainningGroup>(Arrays.asList(trainningGroup)));
		trainningPlan.setPerson(person);
		return trainningPlan;
	}
}
