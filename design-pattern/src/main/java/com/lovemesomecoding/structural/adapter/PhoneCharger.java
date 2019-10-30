package com.lovemesomecoding.structural.adapter;

public class PhoneCharger implements PowerConnector {

	PowerAdapter adapter = null;
	PowerInputType powerType = null;
	
	public PhoneCharger(PowerInputType powerType){
		this.powerType = powerType;
		adapter = new PowerAdapter(powerType);
	}
	
	@Override
	public void plugIn() {
		double power = adapter.connect();
		System.out.println("charge connecting to "+powerType+" power at "+power+" wats");
	}
}
