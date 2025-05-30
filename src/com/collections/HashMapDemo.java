package com.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
     public static void main(String[] args) {
		// HashMap is not used in this example, but you can create a HashMap like this:
		 Map<Integer, String> map = new HashMap<>();
		 map.put(1, "Alice");
		 map.put(2, "Bob");
		 map.put(3, "Charlie");
		 map.put(4, "Alice");
		 map.put(2, "David");
		 map.put(5, "Eve");
		 map.put(6, "Frank");
		 // This will update the value for key "2"
		System.out.println("HashMap size: " + map.size());
		System.out.println("HashMap elements: " + map);
		
		System.out.println("This is a placeholder for HashMap demonstration.");
		System.out.println(map.get(3));
		
		for(Integer x:map.keySet())
			System.out.println("Value for "+x+ ": "+map.get(x));// Output: Charlie
	}
}
