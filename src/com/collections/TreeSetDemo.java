package com.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("Hello");
		treeSet.add("World");
		treeSet.add("Java");
		treeSet.add("Generics");
		treeSet.add("Generics"); // Adding a duplicate element
		//treeSet.add(null); // Adding a null element will throw NullPointerException
		treeSet.add("Programming");
		System.out.println("TreeSet size: " + treeSet.size()); // Output: TreeSet size: 5
		System.out.println("TreeSet elements: " + treeSet); // Output: TreeSet elements: [Generics, Hello, Java, Programming, World]
	    treeSet.remove("Generics"); // Remove the element "Generics"
	    System.out.println("TreeSet elements after removal: " + treeSet); // Output: TreeSet elements after removal: [Hello, Java, Programming, World]
    }
}
