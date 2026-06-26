package com.Swara;

// Multilevel Inheritance


class grandfather{
	public void plot() {
		System.out.println("3cr");
	}
}
 
class father extends grandfather{
	public void car() {
		System.out.println("Skoda");
	}
}

public class Son extends father {
	
	public static void main(String[] args) {
		Son Aditya = new Son();
		Aditya.plot();
		Aditya.car();
	}

}
