package com.Swara;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
	HashSet<String> names =  new HashSet<String>();
	names.add("Swara");
	names.add("Rahul");
	names.add("Rehan");
	names.add("Swara");
	names.add("Rahul");
	System.out.println(names);

	}
}
