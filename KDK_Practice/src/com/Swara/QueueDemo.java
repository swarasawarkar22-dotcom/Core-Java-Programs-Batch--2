package com.Swara;

import java.util.LinkedList;
import java.util.Queue;


public class QueueDemo {
	
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		
		queue.add("Swara");
		queue.add("Jeeny");
		queue.add("Momos");
		
		System.out.println(queue);
	}

}


