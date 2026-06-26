package com.Swara;

import java.util.Scanner;
import java.util.Iterator;

public class Task_1 {
	public static void main(String[] args) {
		
		//Even odd
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int i = sc.nextInt();
		
		if (i % 2 == 0  ) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}
		
		
		//Sum
		
		System.out.println("Enter a number:");
		int N = sc.nextInt();
		
		int sum = 0;
		
		for(int j = 1; j<= N; j++) {
			sum = sum + j;
		}
		System.out.println("Sum="+ sum);
		
		// Table of 5:
		
		 System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        int k = 1;
	        while (k <= 10) {
	            System.out.println(num + " x " + i + " = " + (num * k));
	            k++;
	        }
	        
	     //Bonus:
	        
	        System.out.print("Enter marks: ");
	        int marks = sc.nextInt();

	        if (marks >= 90) {
	            System.out.println("A Grade");
	        } else if (marks >= 75) {
	            System.out.println("B Grade");
	        } else if (marks >= 50) {
	            System.out.println("C Grade");
	        } else {
	            System.out.println("Fail");
	        }
		
	}

}
