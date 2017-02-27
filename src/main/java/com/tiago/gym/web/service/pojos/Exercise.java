package com.tiago.gym.web.service.pojos;

import java.io.Serializable;

public class Exercise implements Serializable{

	private static final long serialVersionUID = -7788619177798333712L;
	
	private String name;
	private String target;
	
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
}
