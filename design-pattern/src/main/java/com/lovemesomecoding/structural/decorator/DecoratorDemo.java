package com.lovemesomecoding.structural.decorator;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * How to implement<br>
 * 1. Make sure your business domain can be represented as a primary component
 * with multiple optional layers over it.<br>
 * 
 * 2. Figure out what methods are common to both the primary component and the
 * optional layers. Create a component interface and declare those methods
 * there.<br>
 * 
 * 3. Create a concrete component class and define the base behavior in it.<br>
 * 
 * 4. Create a base decorator class. It should have a field for storing a
 * reference to a wrapped object. The field should be declared with the
 * component interface type to allow linking to concrete components as well as
 * decorators. The base decorator must delegate all work to the wrapped
 * object.<br>
 * 
 * 5. Make sure all classes implement the component interface.<br>
 * 
 * 6. Create concrete decorators by extending them from the base decorator. A
 * concrete decorator must execute its behavior before or after the call to the
 * parent method (which always delegates to the wrapped object).<br>
 * 
 * 7. The client code must be responsible for creating decorators and composing
 * them in the way the client needs.<br>
 * 
 * @author folaukaveinga
 *
 */
public class DecoratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Weapon ak47 = new AK47(new Gun());

		System.out.println("fired ak47: " + ak47.aimAndFire());
		System.out.println();

		Weapon automatic = new Automatic(new Gun());

		System.out.println("fired automatic: " + automatic.aimAndFire());
		System.out.println();

		// here a riffle can fire like a riffle and also as a automatic(or other guns)
		Weapon riffle = new SniperRiffle(new Automatic(new Gun()));

		System.out.println("fired riffle: " + riffle.aimAndFire());
		System.out.println();

		List<Weapon> weapons = Arrays.asList(new AK47(new Gun()), new Automatic(new Gun()), new SniperRiffle(new Gun()));

		weapons.stream().forEach(weapon -> {
			System.out.println("fire weapon: " + weapon.aimAndFire());
			System.out.println();
		});
	}

}
