package com.Swara;


//polymorphism
//method overloading

class Calculator{
	
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public void add(int a,int b ,int c) {
		System.out.println(a + b +c);
	}
}

public class PolymorphismDemo {
	 public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(10, 10);
		c.add(10, 10, 10);
	}

}
