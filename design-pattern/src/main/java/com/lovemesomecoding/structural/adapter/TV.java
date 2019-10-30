package com.lovemesomecoding.structural.adapter;

public class TV implements PowerConnector {

	PowerAdapter adapter = null;
	PowerInputType powerType = null;
	
	public TV(PowerInputType powerType){
		this.powerType = powerType;
		adapter = new PowerAdapter(powerType);
	}
	
	@Override
	public void plugIn() {
		double power = adapter.connect();
		System.out.println("tv connecting to "+powerType+" power at "+power+" wats");
	}
}
