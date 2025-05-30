package com.general;

public class PersonMain {
     public static void main(String[] args) {
		Person person = new Person(1, "John Doe", "New York");
		Person person2 = new Person(1, "John Doe", "New York"); //mutable
		
		/*System.out.println(person); */// This will call the toString() method of the Person class, if overridden.
		System.out.println(Integer.toHexString(person.hashCode()));
		System.out.println(Integer.toHexString(person2.hashCode()));
		
		person2.setCity("Los Angeles");
		System.out.println(Integer.toHexString(person.hashCode()));
		System.out.println(Integer.toHexString(person2.hashCode()));
	}
}
