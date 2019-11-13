package com.lovemesomecoding.structural.decorator;

public class SniperRiffle extends WeaponDecorator {

	public SniperRiffle(Weapon weapon) {
		super(weapon);
	}
	
	@Override
	public boolean aimAndFire() {
		// TODO Auto-generated method stub
		super.aimAndFire();
		
		// add additional functionalities.
		System.out.println("It's a SniperRiffle, put on scope and fire 1 round a pull!");
		
		return true;
	}
}
