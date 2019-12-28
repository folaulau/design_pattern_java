package com.lovemesomecoding.structural.composite;

/*
 * “Compose objects into tree structure to represent part-whole hierarchies. 
 * Composite lets client treat individual objects and compositions of objects uniformly.”
 *
 * In this pattern the client uses the component interface to interact with 
 * objects which are part of the composition. You can imagine the composite 
 * hierarchy as a tree where there are leaves and composites, and the 
 * requests are sent through this tree.
 *
 * If the recipient of the call is a leaf then the request is handled 
 * directly in this leaf. If the recipient is a composite then this 
 * composite forwards the requests to its children, alternatively this 
 * composite can perform additional operations before and after forwarding.
 * 
 * Disadvantages?
 * 
 * When the tree-structure is defined the composite architecture makes 
 * the tree-structure general and this makes the leaf objects to have 
 * empty methods (or which just simply return nothing valuable) like 
 * the Developer class in the example.
 */
public class CompositeDemo {

	public static void main(String... args) {
        final Developer d1 = new Developer("Jack");
        final Developer d2 = new Developer("Jill");
        final Developer d3 = new Developer("Brian");
        final Developer d4 = new Developer("Bob");
        
        final Manager m1 = new TeamLeader("Marc");
        final Manager m2 = new TeamLeader("Christian");
        final Manager m3 = new TeamLeader("Phil");
        m1.add(d3);
        m1.add(d2);
        m2.add(d1);
		m3.add(d4);
		
		final VP vp = new VP("Joseph");
		vp.add(m1);
		vp.add(m2);
		
		System.out.println("Our estimate is: " + vp.estimateProject("New exotic feature"));
	}

}
