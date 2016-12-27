package com.tiago.gym.web.service;

public class SimplePOJO {
	private String name;
	private Integer age;

	public SimplePOJO() {
		this.name = "Tiago Barbosa Melo";
		this.age = 30;
	}

	public SimplePOJO(String name, Integer age) {
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

}
