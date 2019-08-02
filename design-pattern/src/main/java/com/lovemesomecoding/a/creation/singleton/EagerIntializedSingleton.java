package com.lovemesomecoding.a.creation.singleton;

public class EagerIntializedSingleton {

	private static final EagerIntializedSingleton instance = new EagerIntializedSingleton();

	// private constructor to avoid client applications to use constructor
	private EagerIntializedSingleton() {
		System.out.println("EagerIntializedSingleton - constructor");
	}

	public static EagerIntializedSingleton getInstance() {
		return instance;
	}
}
