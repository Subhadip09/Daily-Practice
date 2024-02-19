package feb19_practice;

import java.util.*;

public class PriorityQueuePractice {
	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("Subhadip");
		pq.add("Rajdip");
		pq.add("Abhikarsh");
		pq.add("Piyush");
		
		System.out.println(pq); //for printing
		for(String str : pq)// another method for printing
		{
			System.out.println(str);
		}
		
		System.out.println("Head is: "+pq.element());
		System.out.println("Head is: "+pq.peek());
		
		pq.remove(); // for removing elements
		System.out.println(pq);
		
		pq.poll(); // another way of removing elements
		System.out.println(pq);
		
	}
}
