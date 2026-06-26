package com.Swara;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> names = new LinkedHashSet<String>();
		names.add("Swara");
		names.add("Rahul");
		names.add("Rehan");
		names.add("Swara");
		names.add("Rahul");
		names.add("Jenny");
		System.out.println(names);
	}

}
// prints the result in preserved form