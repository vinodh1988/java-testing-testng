package com.general;

import java.lang.Object;
public class Person {
	
	private int sno;
	private String name;
	private String city;
	public Person(int sno, String name, String city) {
		this.sno = sno;
		this.name = name;
		this.city = city;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
   	public void setCity(String city) {
		this.city = city;
	}

   	@Override
   		public String toString() {

   	     	return "Person [sno=" + sno + ", name=" + name + ", city=" + city + "]";
   		}
   	
   	@Override
   	   public int hashCode() {
   		final int prime = 31;
   		int result = 1;
   		result = prime * result + sno;
   		result = prime * result + ((name == null) ? 0 : name.hashCode());
   		result = prime * result + ((city == null) ? 0 : city.hashCode());
   		return result;
   	}
   	
}
