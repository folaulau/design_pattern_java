package com.lovemesomecoding.b.creation.factory_method;

public class Van implements Vehicle {

	@Override
	public void run() {
		System.out.println("Van -> run...");
	}

	@Override
	public void stop() {
		System.out.println("Van -> stop...");
	}

	@Override
	public void reverse() {
		System.out.println("Van -> reverse...");
	}
	
	

}
