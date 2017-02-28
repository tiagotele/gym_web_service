package com.tiago.gym.web.service.models;

import java.io.Serializable;

public class Person implements Serializable{
	private static final long serialVersionUID = -5100054710038170463L;
	private String name;
	private Integer age;
	private Goal goal;

	public Person() {
		this.name = "Tiago Barbosa Melo";
		this.age = 30;
		this.goal = Goal.BODY_BUILDING;
	}

	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Goal getGoal() {
		return goal;
	}

	public void setGoal(Goal goal) {
		this.goal = goal;
	}
}
