package com.Swara;

public class Main {
//	public void siri(String name) { //parameters
//		System.out.println("Hey How are you??");
//		System.out.println(name);
//	}
//	
//	public static void main(String[] args) {
//		Main obj = new Main();
//		obj.siri("Swara"); //arguments
//		obj.siri("Jeeny");
//	}
	
	 // parameters with arguments:
	
	public void add(int x, int y) {
		System.out.println(x+y);
	}
	public void multiply(int a, int b) {
		System.out.println(a*b);
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.add(12,44);
		obj.multiply(22, 44);
	}
}
