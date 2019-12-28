package com.lovemesomecoding.structural.composite;

import java.util.List;
import java.util.Random;

public class Developer implements Employee {
    String name;

	public Developer(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void add(Employee e) {
	}

	@Override
	public void remove(Employee e) {
	}

	@Override
	public List<Employee> getEmployees() {
		return null;
	}

	@Override
	public int estimateProject(String projectDescription) {
		return new Random().nextInt(24);
	}

	@Override
	public String toString() {
		return "I am " + getName() + ", Developer";
	}
}
