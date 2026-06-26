package com.Swara;

class College {
	String collegeName;
	
	College(String collegeName) {
		this.collegeName = collegeName ;
	}
	
}

public class Department extends College {
	
	String departmentName;
	
	Department (String collegeName , String departmentName) {
		
		super(collegeName);
		this.departmentName = departmentName;
	}
	
	void display() {
		System.out.println("College Name : " + collegeName);
		System.out.println("Department Name : " + departmentName);
	}
	
	public static void main(String[] args) {
		
		Department d = new Department("KDK College" , "Information Technology");
		d.display();
	}

}
