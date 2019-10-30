package com.lovemesomecoding.creation.singleton;

public class LazyInitializedSingleton {

	private static LazyInitializedSingleton instance;

	private LazyInitializedSingleton() {
		System.out.println("LazyInitializedSingleton - constructor");
	}

	public static LazyInitializedSingleton getInstance() {
		if (instance == null) {
			System.out.println("Create a new LazyInitializedSingleton");
			instance = new LazyInitializedSingleton();
		}else{
			System.out.println("Return the current instance");
		}
		return instance;
	}
}