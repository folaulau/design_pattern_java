package com.lovemesomecoding.b.creation.factory_method;

public enum VehicleType {
	/*
	 * These values are passed to the constructor when the constant is created. 
	 * Java requires that the constants be defined first, prior to any fields or methods. Also, 
	 * when there are fields and methods, the list of enum constants must end with a semicolon.
	 * 
	 * Note: The constructor for an enum type must be package-private or private access. 
	 * It automatically creates the constants that are defined at the beginning of the enum body. 
	 * You cannot invoke an enum constructor yourself. 
	 * */
	VAN(120),
	SPORTSCAR(330);
	
	private final int speed;
	
	private VehicleType(int maxSpeed) {
		// TODO Auto-generated constructor stub
		this.speed = maxSpeed;
	}
	
	int getHighestSpeed(String vehicleType){
		if(vehicleType.equalsIgnoreCase("van")){
			return VAN.speed;
		}else{
			return SPORTSCAR.speed;
		}
	}
}
