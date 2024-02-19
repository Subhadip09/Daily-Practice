package feb19_practice;

import java.util.*;

public class ArrayDequePractice {
	public static void main(String[] args) {
		// creating deque and adding elements
		Deque<String> dq = new ArrayDeque<> ();
		dq.add("Gautam");
		dq.add("Arun");
		dq.add("Subu");
		dq.add("Arya");
		
		for(String str : dq)
		{
			System.out.println(str);
		}
	}
}
