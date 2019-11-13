package com.lovemesomecoding.structural.decorator;

public class AK47 extends WeaponDecorator {

	public AK47(Weapon weapon) {
		super(weapon);
	}
	
	@Override
	public boolean fire() {
		// TODO Auto-generated method stub
		super.fire();
		
		// add additional functionalities.
		System.out.println("It's an AK47, fire 5 rounds a pull!");
		
		return true;
	}
}
