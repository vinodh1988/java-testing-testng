package com.collections;

import java.util.Set;
import java.util.TreeSet;

public class MainCheck {
  public static void main(String[] args) {
    Kid kid1 = new Kid(1, "Alice");
	Kid kid2 = new Kid(2, "Arnold");
	Kid kid3 = new Kid(3, "Akash");
    Kid kid4 = new Kid(4, "Ashley");
	Kid kid5 = new Kid(5, "Arvin");
	Kid kid6 = new Kid(6, "Arvin");
	
	Set<Kid> kidsSet = new TreeSet<>();
	kidsSet.add(kid1);
	kidsSet.add(kid2);
	kidsSet.add(kid3);
	kidsSet.add(kid4);
	kidsSet.add(kid5);
	kidsSet.add(kid6);

	for (Kid kid : kidsSet) {
	  System.out.println(kid);
	}
	

	
	  }
}
/*
  String x= "Hello";"
  x.substring(1) // returns "ello"
  x.substring(1, 3) // returns "el"
*/