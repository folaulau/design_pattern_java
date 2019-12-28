package com.lovemesomecoding.structural.composite;

public class TeamLeader extends Manager {
	public TeamLeader(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "I am " + getName() + ", Team Leader";
	}
}