package com.lovemesomecoding.structural.decorator;

public class Riffle extends WeaponDecorator {

	public Riffle(Weapon weapon) {
		super(weapon);
	}
	
	@Override
	public boolean fire() {
		// TODO Auto-generated method stub
		super.fire();
		
		// add additional functionalities.
		System.out.println("It's a Riffle, fire 1 round a pull!");
		
		return true;
	}
}
