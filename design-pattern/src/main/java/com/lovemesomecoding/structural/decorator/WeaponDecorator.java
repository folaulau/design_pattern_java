package com.lovemesomecoding.structural.decorator;

public abstract class WeaponDecorator implements Weapon {

	private Weapon weapon;
	
	public WeaponDecorator(Weapon weapon) {
		this.weapon = weapon;
	}

	@Override
	public boolean fire() {
		// TODO Auto-generated method stub
		return weapon.fire();
	}
	
}
