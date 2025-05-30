package com.general;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
  public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	list.add("Hello");
	list.add("World");
	list.add("Java");
	list.add("Generics");
	list.add("Programming");
	list.add(null);
	list.add("Generics"); // Adding a duplicate element
	System.out.println("List size: " + list.size()); // Output: List size: 5
	System.out.println("List elements: " + list); // Output: List elements: [Hello, World, Java, Generics, Programming]
	System.out.println("First element: " + list.get(0)); // Output: First element: Hello
	System.out.println("Last element: " + list.get(list.size() - 1)); // Output: Last element: Programming
    System.out.println("2nd Element: "+ list.get(1)); // Output: Is list empty? false
    list.remove(2); // Remove the element at index 2 (Java)
    System.out.println("List elements: " + list);
    list.add(2, "Python"); // Insert "Python" at index 2
    System.out.println("List elements: " + list);
    
    for (String item : list) {
	  System.out.println("Item: " + item);
	}
    
    for(int i = 0; i < list.size(); i++) {
	  System.out.println("Item at index " + i + ": " + list.get(i));
	}
  }
}
