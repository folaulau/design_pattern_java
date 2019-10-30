package com.lovemesomecoding.structural.adapter;

public class PowerAdapter implements WorldElectricPower, UsElectricPower{

	private PowerInputType powerType;
	
	public PowerAdapter(PowerInputType powerType){
		this.powerType = powerType;
	}

	@Override
	public double connect() {
		return (powerType!=null && powerType.equals(PowerInputType.US)) ? UsElectricPower.output : WorldElectricPower.output;
	}
}
