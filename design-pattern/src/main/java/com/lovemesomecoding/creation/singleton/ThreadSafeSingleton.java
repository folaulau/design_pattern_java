package com.lovemesomecoding.creation.singleton;

public class ThreadSafeSingleton {
	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton() {
		System.out.println("ThreadSafeSingleton - constructor, use of synchronized");
	}

	public static synchronized ThreadSafeSingleton getInstance() {
		if (instance == null) {
			System.out.println("Create a new ThreadSafeSingleton");
			instance = new ThreadSafeSingleton();
		} else {
			System.out.println("Return the current instance");
		}
		return instance;
	}
}
