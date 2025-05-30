package com.exceptions;

import java.util.Scanner;

public class ExceptionDemo {
  public static void main(String[] args) {
	  try {
	   int [] arr = {324,24,35};
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter an index to access the array element:");
	   int index = Integer.parseInt(sc.next());
	   System.out.println("Element at index " + index + " is: " + arr[index]);
	  }
	  catch (ArrayIndexOutOfBoundsException e) {
		  System.out.println("Error: Index out of bounds. Please enter a valid index.");
	  }
	
	  catch (Exception e) {
		  System.out.println("An unexpected error occurred: " + e.getMessage());
	  }          	
	  finally {
		  System.out.println("Execution completed.");
	  } // whether an exception occurs or not, this block will always execute
   }
}
