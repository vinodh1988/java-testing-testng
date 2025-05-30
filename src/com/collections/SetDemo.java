package com.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
   public static void main(String[] args) {
	 Set<String> set = new HashSet<String>();
	 
	 set.add("Hello");
	 set.add("World");
	 set.add("Java");
	 set.add("Generics");
	 set.add("Generics"); // Adding a duplicate element
	 set.add(null); // Adding a null element
	 System.out.println("Set size: " + set.size()); // Output: Set size: 5
	 System.out.println("Set elements: " + set); // Output: Set elements: [null, Hello, World, Java, Generics]
     
	 for (String item : set) {
	   System.out.println("Item: " + item);
      }
}
}
