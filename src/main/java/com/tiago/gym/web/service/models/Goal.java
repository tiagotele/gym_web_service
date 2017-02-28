package com.tiago.gym.web.service.models;

public enum Goal {
	BODY_BUILDING("Body building"),
	LOSE_WEIGHT("Lose weight"),
	KEEP_BODY("Keep body");
	
	private final String goal;
	
	private Goal(final String goal){
		this.goal = goal;
	}
	
	@Override
	public String toString() {
		return this.goal;
	}
}
