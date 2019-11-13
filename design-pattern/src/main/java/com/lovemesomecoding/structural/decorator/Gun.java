package com.lovemesomecoding.structural.decorator;

public class Gun implements Weapon {

	@Override
	public boolean aimAndFire() {
		System.out.println("fire gun!!!");
		return true;
	}

}
