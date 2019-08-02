package com.lovemesomecoding.b.creation.factory_method;

public class VehicleFactory {
	public static Vehicle getHehicle(VehicleType vehicleType) {
		Vehicle vehicle = null;
		switch (vehicleType) {
		case VAN:
			vehicle = new Van();
			break;
		case SPORTSCAR:
			vehicle = new SportsCar();
			break;
		default:
			break;
		}
		return vehicle;
	}
}
