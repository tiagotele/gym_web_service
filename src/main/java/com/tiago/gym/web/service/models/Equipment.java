package com.tiago.gym.web.service.models;

import java.io.Serializable;

public class Equipment implements Serializable{
	private static final long serialVersionUID = -1064421146105671855L;
	private String name;
	private Integer machineNumber;

	public Equipment(){
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMachineNumber() {
		return machineNumber;
	}
	public void setMachineNumber(Integer machineNumber) {
		this.machineNumber = machineNumber;
	}

}
