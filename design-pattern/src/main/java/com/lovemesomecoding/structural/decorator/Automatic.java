package com.lovemesomecoding.structural.decorator;

public class Automatic extends WeaponDecorator {

	public Automatic(Weapon weapon) {
		super(weapon);
	}
	
	@Override
	public boolean fire() {
		super.fire();
		
		// add additional functionalities.
		
		System.out.println("It's an automatic, fire 10 rounds a pull!");
		
		return true;
	}
}
