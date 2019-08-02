package com.lovemesomecoding.a.creation.singleton;

public class Main {
	
	public static void main(String[] args) {
		// best way
		EnumSingleton instance = EnumSingleton.INSTANCE.getInstance();
		
		System.out.println("instance.getInfo()="+instance.getInfo());
	}
}
