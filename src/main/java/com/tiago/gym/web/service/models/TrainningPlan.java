package com.tiago.gym.web.service.models;

import java.io.Serializable;
import java.util.Set;

public class TrainningPlan implements Serializable{

	private static final long serialVersionUID = 979903089796836626L;
	Long id;
	Set<TrainningGroup> trainningGroups;
	Person person;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Set<TrainningGroup> getTrainningGroups() {
		return trainningGroups;
	}
	public void setTrainningGroups(Set<TrainningGroup> trainningGroups) {
		this.trainningGroups = trainningGroups;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	
}
