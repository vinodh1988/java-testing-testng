package com.tests;




import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.collections.Group;
import com.collections.Kid;

public class ListTest {
  
    Group group;
/*
   @BeforeClass
    public void init() {
	    group = new Group(null);
    
    }*/
  
    @Test(expectedExceptions = NullPointerException.class)
    public void testNullList() {
    	group.setKids(null);
		group.getKids().get(0); // This should throw NullPointerException
	}
    
    @Test 
    public void testEmptyList() {
		group.setKids(java.util.Collections.emptyList());
		//assert group.getKids().isEmpty() : "List should be empty";
		assertEquals(group.getKids().size(), 0, "List size should be 0");
	}
    
    @Test
    public void testNonEmptyList() {
       ArrayList<Kid> kids = new ArrayList<>();
       kids.add(new Kid(1,"Alice"));
       kids.add(new Kid(2,"Bob"));
       kids.add(new Kid(3,"Charlie"));
       group.setKids(kids);
       assertEquals(kids.size(), 3, "List size should be 3");
       assertEquals(kids.get(0).getName(), "Alice", "First kid's name should be Alice");
    }
}
