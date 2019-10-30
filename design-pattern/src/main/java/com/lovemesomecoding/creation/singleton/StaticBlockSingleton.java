package com.lovemesomecoding.creation.singleton;

public class StaticBlockSingleton {

	private static StaticBlockSingleton instance;

	private StaticBlockSingleton() {
		System.out.println("StaticBlockSingleton - constructor");
	}

	// static block initialization for exception handling
	static {
		try {
			System.out.println("staticblock");
			instance = new StaticBlockSingleton();
		} catch (final Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}

	public static StaticBlockSingleton getInstance() {
		return instance;
	}
}
