package com.Swara;

public class ExceptionHandling {
	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		try {
			int result = 10/0 ;
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("cannot divide");
		}
	}

}
