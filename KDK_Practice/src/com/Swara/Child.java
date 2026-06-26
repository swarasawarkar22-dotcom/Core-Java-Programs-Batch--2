package com.Swara;

// Single Inheritance

class Dad{
	public void car() {
		System.out.println("BMW");
	}
}

public class Child extends Dad {
	
	public static void main(String[] args) {
		Child swara = new Child();
		swara.car();
	}

}
