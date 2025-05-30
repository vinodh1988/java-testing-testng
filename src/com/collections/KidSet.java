package com.collections;

import java.util.HashSet;
import java.util.Set;

public class KidSet {
   public static void main(String[] args) {
	  Kid kid1 = new Kid(1, "Alice");
	  Kid kid2 = new Kid(2, "Bob");
	  Kid kid3 = new Kid(3, "Charlie");
	  Kid kid4 = new Kid(4, "Alice"); 

	  Set<Kid> kidsSet = new HashSet<>();
	  kidsSet.add(kid1);
	  kidsSet.add(kid2);
	  kidsSet.add(kid3);
	  kidsSet.add(kid4); 

	  System.out.println("Kids Set size: " + kidsSet.size()); // Output: Kids Set size: 3
	  System.out.println("Kids Set elements: " + kidsSet); // Output: Kids Set elements: [Kid [id=1, name=Alice], Kid [id=2, name=Bob], Kid [id=3, name=Charlie]]
  
	  for (Kid kid : kidsSet) {
		  System.out.println("Kid Name: " + kid.getName());
	  }
   }
}
