package com.general;

public class Immutable {
  private String name;
 
  public Immutable(String name) {
	this.name = name;
  }
  public String getName() {
	  return name;
  }
  
  public int hashCode() {
	  final int prime = 31;
	  int result = 1;
	  result = prime * result + ((name == null) ? 0 : name.hashCode());
	  return result;
  }
  
}
