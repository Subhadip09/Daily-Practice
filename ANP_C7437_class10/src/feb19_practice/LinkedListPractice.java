package feb19_practice;

import java.util.*;

public class LinkedListPractice {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Raj");// adding objects
		list.add("Dip");
		list.add("Subha");
		list.add("Ajay");
		
		for(String str : list)
		{
			System.out.println(str);
		}
	}
}
