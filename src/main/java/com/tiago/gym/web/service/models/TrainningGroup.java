package com.tiago.gym.web.service.models;

import java.io.Serializable;
import java.util.Set;

public class TrainningGroup implements Serializable{
	private static final long serialVersionUID = -555815171384307739L;
	Long id;
	Set<Exercise> exercisesSet;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Set<Exercise> getExercisesSet() {
		return exercisesSet;
	}
	public void setExercisesSet(Set<Exercise> exercisesSet) {
		this.exercisesSet = exercisesSet;
	}

}
