package com.Swara;

public class Student {
	
	Student(){
		System.out.println("Hello I'm Student");
	}
	
	Student(String name){
		System.out.println("Hello I'm : " + name);
	}
	
	Student(int age){
		System.out.println("Age: " + age);
	}
	
	public static void main(String[] args) {
		Student obj1 = new Student();
		Student obj2 = new Student("Swara");
		Student obj3 = new Student(21);
	}

}
