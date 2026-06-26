package com.Swara;

public class StringMutable {
	public static void main(String[] args) {
		
		// not thread safe
		StringBuilder sb = new StringBuilder();
		sb.append("Programming");
		System.out.println(sb);
		
		//Thread Safe
		StringBuffer sb2 = new StringBuffer("Java");
		sb2.append("Programming");
		System.out.println(sb2);
	}

}
