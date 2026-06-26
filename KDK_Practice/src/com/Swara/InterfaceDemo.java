package com.Swara;

interface ATM1 {
	public void withdraw();
}

class axis implements ATM1 {
	
	public void withdraw() {
		System.out.println("Money withdraw Successfully!!");
	}
}

public class InterfaceDemo {
	public static void main(String[] args) {
		axis a = new axis();
		a.withdraw();
	}

}
