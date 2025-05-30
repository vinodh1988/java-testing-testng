package com.collections;

public class Kid implements Comparable<Kid> {
	private Integer id;
	private String name;
	public Kid(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
    public void setName(String name) {
    				this.name = name;
    }
   public String toString() {
    	return "Kid [id=" + id + ", name=" + name + "]";	
   }
   
   @Override
public int compareTo(Kid o) {
	if(this.name.equals(o.name)) {
		return 0;
	} 
	else if(this.name.compareTo(o.name) < 0) {
		return -1;
	} else {
		return 1;
	}
}
   /*
@Override
public int compareTo(Kid o) {
	// TODO Auto-generated method stub
	if(this.id == o.id) {
		return 0;
	} 
	else if(this.id < o.id) {
		return -1;
	} else {
		return 1;
    }
}*/
}

