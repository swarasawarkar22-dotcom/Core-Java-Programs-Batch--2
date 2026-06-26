package com.Swara;

public class StringMethodsDemo {
	
	public static void main(String[] args) {
		
		 String text = "Hello Java World";

	        System.out.println("Original String: " + text);
	        System.out.println("Length: " + text.length());
	        System.out.println("Uppercase: " + text.toUpperCase());
	        System.out.println("Lowercase: " + text.toLowerCase());
	        System.out.println("Character at index 4: " + text.charAt(4));
	        System.out.println("Contains 'Java': " + text.contains("Java"));
	        System.out.println("Starts with 'Hello': " + text.startsWith("Hello"));
	        System.out.println("Ends with 'World': " + text.endsWith("World"));
	        System.out.println("Index of 'Java': " + text.indexOf("Java"));
	        System.out.println("Last Index of 'o': " + text.lastIndexOf("o"));
	        System.out.println("Substring(6): " + text.substring(6));
	        System.out.println("Substring(6,10): " + text.substring(6, 10));

	        String s1 = "Java";
	        String s2 = "Java";

	        System.out.println("Equals: " + s1.equals(s2));
	        System.out.println("Equals Ignore Case: " + "JAVA".equalsIgnoreCase("java"));
	        System.out.println("Replace: " + text.replace("Java", "Python"));
	        System.out.println("Is Empty: " + text.isEmpty());

	        String spaces = "   Java   ";
	        System.out.println("Trim: '" + spaces.trim() + "'");

	        String fruits = "Apple,Mango,Banana";
	        String[] arr = fruits.split(",");

	        System.out.println("Split Result:");
	        for (String fruit : arr) {
	            System.out.println(fruit);
	        }

	        String joined = String.join("-", "Java", "Python", "C++");
	        System.out.println("Join: " + joined);

	        System.out.println("Repeat: " + "Hi ".repeat(3));
	}

}
