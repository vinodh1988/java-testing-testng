package com.general;

import java.util.Stack;

public class StackDemo {
  public static void main(String[] args) {
	Stack<Integer> stack = new Stack<>();
	
	// Push elements onto the stack
	stack.push(10);
	stack.push(20);
	stack.push(30);
	
	// Peek at the top element
	System.out.println("Top element: " + stack.peek());  //return top element without removing it
	
	// Pop elements from the stack
	System.out.println("Popped element: " + stack.pop()); //remove and return the top element
	System.out.println("Popped element: " + stack.pop());

	
	// Check if the stack is empty
	System.out.println("Is stack empty? " + stack.isEmpty());
	
	System.out.println("Popped element: " + stack.pop());
	System.out.println("Is stack empty? " + stack.isEmpty());
	
	Stack<String> stringStack = new Stack<>();
	stringStack.push("Hello");
	stringStack.push("World");
	System.out.println("String Stack Top element: " + stringStack.peek()); //return top element without removing it
	
  }
}
