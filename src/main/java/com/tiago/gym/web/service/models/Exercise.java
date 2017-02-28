package com.tiago.gym.web.service.models;

import java.io.Serializable;

public class Exercise implements Serializable{
	private static final long serialVersionUID = -7788619177798333712L;
	private String name;
	private String target;
	private Equipment equipment;
	
	public Exercise(){
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}

	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}
	
	
}
