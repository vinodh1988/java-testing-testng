package com.tests;

import java.util.TreeSet;

import org.testng.annotations.Test;

public class TreeSetTests {
	
	TreeSet<String> treeSet= new TreeSet<String>();
	
	@Test(expectedExceptions = NullPointerException.class)
	public void testAddNull() {
		treeSet.add("Hello");
		treeSet.add("World");
		treeSet.add(null); // This should throw NullPointerException
	}
	
	@Test(expectedExceptions = ClassCastException.class)
	public void testAddNonComparable() {
		TreeSet<Store> temp=new TreeSet<Store>();
		temp.add(new Store(1));
		temp.add(new Store(2));
		temp.add(new Store(3));
		assert temp.size() == 3 : "TreeSet should contain 3 elements";
	}
	

}
