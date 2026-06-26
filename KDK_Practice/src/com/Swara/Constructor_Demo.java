package com.Swara;

public class Constructor_Demo {
	
	Constructor_Demo() { // default
		System.out.println("Hello I M Constructor");
	}
	
	Constructor_Demo(String name) { // parameterized
		System.out.println("Hello I M Constructor 2 : " + name);
	}
	Constructor_Demo(int a) {
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		Constructor_Demo obj1 = new Constructor_Demo();
		Constructor_Demo obj2 = new Constructor_Demo("Swara");
		Constructor_Demo obj3 = new Constructor_Demo(22);
	}
	
}
