package com.lovemesomecoding.structural.composite;

public class VP extends Manager {
	public VP(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "I am " + getName() + ", VP";
	}

	/**
	 * VP doubles the estimated amount.
	 */
	@Override
	public int estimateProject(String projectDescription) {
		System.out.println("I am " + getName() + ", the VP, and calling for an estimate...");
		final int projectEstimate = super.estimateProject(projectDescription);
		System.out.println("Original estimate: " + projectEstimate);
		return Math.toIntExact(Math.round(projectEstimate * 2));
	}
}