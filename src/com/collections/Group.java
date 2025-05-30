package com.collections;

import java.util.List;

public class Group {
   List<Kid> kids; //only reference
   
   public Group(List<Kid> kids) {
	  this.kids = kids;
   }
   
   public List<Kid> getKids() {
	  return kids;
   }
   
   public void setKids(List<Kid> kids) {
	  this.kids = kids;
   }
}
