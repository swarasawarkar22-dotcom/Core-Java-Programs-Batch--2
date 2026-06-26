package com.Swara;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> books = new Stack<String>();
		
		//Add books
		
		books.push("Java");
		books.push("C++");
		books.push("Python");
		
		System.out.println("Books in Stack : " +books );
		
		//Top Book
		System.out.println("Top Book : " + books.peek());
		
		//Remove books
		System.out.println("Removed Book: " + books.pop());
		System.out.println("Removed Book: " + books.pop());
		
		//Remaining Book
		System.out.println("Remaining Book: " + books);
		
	}

}
