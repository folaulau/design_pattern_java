package com.lovemesomecoding.structural.adapter;

/**
 * 
 * An Adapter pattern acts as a connector between two incompatible<br>
 * interfaces that otherwise cannot be connected directly. <br>
 * An Adapter wraps an existing class with a new interface<br>
 * so that it becomes compatible with the client’s interface.<br>
 * 
 * <br>
 * <br>
 * 
 * The main motive behind using this pattern is to convert<br>
 * an existing interface into another interface that the<br>
 * client expects. It's usually implemented once the<br>
 * application is designed. <br>
 * <br>
 * <b>WHEN TO USE:</b><br>
 * When an outside component provides captivating <br>
 * functionality that we'd like to reuse, but it's <br>
 * incompatible with our current application. A suitable <br>
 * Adapter can be developed to make them compatible with each other<br>
 * When our application is not compatible with the interface <br>
 * that our client is expectinG When we want to reuse legacy<br>
 * code in our application without making any modification<br>
 * in the original code
 * 
 * @author folaukaveinga
 *
 */
public class StructuralDesignPatternDemo {

	public static void main(String[] args) {
		PhoneCharger usCharger = new PhoneCharger(PowerInputType.US);
		usCharger.plugIn();

		TV worldTv = new TV(PowerInputType.WORLD);
		worldTv.plugIn();
		
		TV usTv = new TV(PowerInputType.US);
		usTv.plugIn();
	}
}
