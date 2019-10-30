package com.lovemesomecoding.creation.factory_method;

public class FactoryMethodMain {
	
	public static void main(String[] args) {
		Van van1 = (Van) VehicleFactory.getHehicle(VehicleType.VAN);
		System.out.println("hashcode van1: "+van1.hashCode());
		van1.run();
		van1.stop();
		van1.reverse();
		
		
		
		Van van2 = (Van) VehicleFactory.getHehicle(VehicleType.VAN);
		System.out.println("hashcode van2: "+van2.hashCode());
		van2.run();
		van2.stop();
		van2.reverse();
		
		if(van1==van2) {
			System.out.println("van1==van2, same in memory");
		}
		
		if(van1==van1) {
			System.out.println("van1==van1, same in memory");
		}
	}
}
