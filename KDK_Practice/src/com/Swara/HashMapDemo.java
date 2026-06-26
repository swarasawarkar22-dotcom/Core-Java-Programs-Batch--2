package com.Swara;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> names = new HashMap<Integer, String>();
		
		names.put(101, "Swara");
		names.put(102, "Jenny");
		names.put(103, "Kajal");
		names.put(104, "Jenny");
		names.put(105, "Vaibhav");
		
		System.out.println(names);
	}

}
