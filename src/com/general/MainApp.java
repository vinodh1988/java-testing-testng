package com.general;

public class MainApp {
  public static void main(String[] args) {
	// Example usage of Mutable class
	Mutable mutable = new Mutable("Initial Name");
	System.out.println("Mutable Name: " + mutable.getName());
	mutable.setName("Updated Name");
	System.out.println("Mutable Name after update: " + mutable.getName());

	// Example usage of Immutable class
	Immutable immutable = new Immutable("Immutable Name");
	System.out.println("Immutable Name: " + immutable.getName());
	
	String x ="Nicholas";
	x=x.concat("Jr"); //new object
	
	// Note: Immutable objects cannot be changed after creation, so no setName method exists.
  }
}
