package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Sorting {
	 public static void main(String[] args) {
     List<String> list = new ArrayList<>();
     list.add("Senior Rahul");
     list.add("Junior Ramesh");
     list.add("Senior Kiran");
     list.add("Captain Mahesh");
     list.add("Senior Vikas");
     list.add("Junior Bhavesh");
     list.add("Major  Prem");
     list.add("Junior Neha");
     list.add("Senior Kiran");
     list.add("Major  Jackson");
     list.add("Captain Arun");
     list.add("Junior Mahesh");
     Map<String, Set<String>> map = new TreeMap<>();
     map.put("Senior", new TreeSet<>());
     map.put("Junior", new TreeSet<>());
     map.put("Captain", new TreeSet<>());
     map.put("Major", new TreeSet<>());
     for (String str : list) {
		  String rank = str.substring(0,8);
		  Set<String> seniors =map.get("Senior");
		  Set<String> juniors =map.get("Junior");
		  Set<String> captains =map.get("Captain");
		  Set<String> majors =map.get("Major");
		  if(rank.contains("Senior")) {
		       seniors.add(str.replace("Senior ", "")); //only name will be result
		       map.put("Senior", seniors);
		  } else if(rank.contains("Junior")) {
			  juniors.add(str.replace("Junior ", ""));
			  map.put("Junior", juniors);
		  } else if(rank.contains("Captain")) {
			  captains.add(str.replace("Captain ", ""));
			  map.put("Captain", captains);
		  } else if(rank.contains("Major")) {
			  majors.add(str.replace("Major ", ""));
			  map.put("Major", majors);
		  } else if(rank.contains("Captain")) {
			  captains.add(str.replace("Captain ", ""));
			  map.put("Captain", captains);
		  }  else {
			  System.out.println(str + " has an unknown rank");
		  }
	   }
     
     System.out.println (map);
     System.out.println("Seniors: " + map.get("Senior"));
     System.out.println("Juniors: " + map.get("Junior"));
     System.out.println("Captains: " + map.get("Captain"));
     System.out.println("Majors: " + map.get("Major"));
	 }
}
