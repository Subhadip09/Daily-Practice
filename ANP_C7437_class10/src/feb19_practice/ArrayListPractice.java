package feb19_practice;

import java.util.*;

public class ArrayListPractice {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(); // creating arraylist
		list.add("Raj");// adding objects
		list.add("Dip");
		list.add("Subha");
		list.add("Ajay");
		
		// Traversing list using forEach loop
		for(String str : list)
		{
			System.out.println(str);
		}
	}
}
