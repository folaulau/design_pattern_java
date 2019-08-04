package com.lovemesomecoding.b.creation.factory_method;

public class FactoryMethodMain {
	
	public static void main(String[] args) {
		System.out.println("Chapter 1 - Factory Method");
		Van van = (Van) VehicleFactory.getHehicle(VehicleType.VAN);
		van.run();
		van.stop();
		van.reverse();
		System.out.println(
				"Lession learned: I must know what class to use. I am not using new keyword which is a good thing.\n");
		System.out.println("I also learned about ENUM: 'An enum type is a special data type that enables \n"
				+ "for a variable to be a set of predefined constants.You should use enum types any time you need to \n"
				+ "represent a fixed set of constants. That includes natural enum types such as the \n"
				+ "planets in our solar system and data sets where you know all possible values at \n"
				+ "compile time for example, the choices on a menu, command line flags, and so on.'	\n"
				+ "These values are passed to the constructor when the constant is created. \n"
				+ "Java requires that the constants be defined first, prior to any fields or methods. Also, \n"
				+ "when there are fields and methods, the list of enum constants must end with a semicolon.\n"

				+ "Note: The constructor for an enum type must be package-private or private access. \n"
				+ "It automatically creates the constants that are defined at the beginning of the enum body. \n"
				+ "You cannot invoke an enum constructor yourself. \n");
		System.out.println(VehicleType.VAN.getHighestSpeed("van"));

		for (VehicleType type : VehicleType.values()) {
			System.out.println(type.name());
		}
	}
}
