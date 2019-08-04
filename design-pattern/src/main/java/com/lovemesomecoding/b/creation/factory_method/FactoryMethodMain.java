package com.lovemesomecoding.b.creation.factory_method;

public class FactoryMethodMain {
	
	public static void main(String[] args) {
		Van van = (Van) VehicleFactory.getHehicle(VehicleType.VAN);
		van.run();
		van.stop();
		van.reverse();
		
		System.out.println("high speed: "+VehicleType.VAN.getHighestSpeed("van"));

		for (VehicleType type : VehicleType.values()) {
			System.out.println("type: "+type.name());
		}
	}
}
