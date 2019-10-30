package com.lovemesomecoding.creation.factory_method;

public class SportsCar implements Vehicle {

	@Override
	public void run() {
		System.out.println("SportsCar -> run...");
	}

	@Override
	public void stop() {
		System.out.println("SportsCar -> stop...");
	}

	@Override
	public void reverse() {
		System.out.println("SportsCar -> reverse...");
	}

}
