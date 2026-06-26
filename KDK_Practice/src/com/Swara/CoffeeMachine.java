package com.Swara;

class BoilWater extends Thread {
	
	public void run() {
		System.out.println("Boiling Water...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Water is Ready!!\n");
	}
	
}

class BoilMilk extends Thread {
	public void run() {
		System.out.println("Boiling Milk...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Milk is Ready !!\n");
	}
}

class GrindCoffee extends Thread {
	public void run () {
		System.out.println("Grinding Coffee Beans...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Coffee powder is Ready!!!\n");
	}
}


public class CoffeeMachine {
	
	public static void main(String[] args) {
		
		BoilWater water = new BoilWater();
		BoilMilk milk = new BoilMilk();
		GrindCoffee coffee = new GrindCoffee();
		
		water.start();
		
		try {
			water.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		milk.start();
		
		try {
			milk.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		coffee.start();
		
		try {
			coffee.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(" ☕ Coffee is Ready!!!\n");
		
	}

}































