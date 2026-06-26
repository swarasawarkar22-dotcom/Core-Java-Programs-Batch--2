package com.Swara;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String>	names = new LinkedHashMap<Integer, String>();
		
		names.put(101, "Swara");
		names.put(102, "Jenny");
		names.put(103, "Kajal");
		names.put(104, "Jenny");
		names.put(105, "Vaibhav");
		
		System.out.println(names);
	
	}

}
