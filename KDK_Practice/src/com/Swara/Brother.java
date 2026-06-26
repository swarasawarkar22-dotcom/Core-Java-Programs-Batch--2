package com.Swara;

// Hierarichal Inheritance

class parent {
	public void house() {
		System.out.println("2BHK");
	}
}

class sister extends parent {
	
}

class sister2 extends sister{
	
}



public class Brother extends parent {
	
	public static void main(String[] args) {
		Brother obj = new Brother();
	    obj.house();
		sister obj2 = new sister();
		obj2.house();
	}
}
