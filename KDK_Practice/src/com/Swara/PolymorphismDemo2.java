package com.Swara;

// method overridding : 


class Women{
	void work() {
		System.out.println("Women is Working!!");
	}
}

class Teacher extends Women {
	void work() {
		System.out.println("Women is Teaching!!");
	}
}

public class PolymorphismDemo2 {
	public static void main(String[] args) {
		Women w = new Women();
		w.work();
		Teacher t = new Teacher();
		t.work();
	}

}
