package com.lovemesomecoding.structural.decorator;

public class Automatic extends WeaponDecorator {

	public Automatic(Weapon weapon) {
		super(weapon);
	}
	
	@Override
	public boolean aimAndFire() {
		super.aimAndFire();
		
		// add additional functionalities.
		
		System.out.println("It's an automatic, put on silencer and fire 10 rounds a pull!");
		
		return true;
	}
}
