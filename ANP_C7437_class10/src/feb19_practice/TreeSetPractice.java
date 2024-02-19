package feb19_practice;

import java.util.*;

public class TreeSetPractice {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		set.add("Ishika");
		set.add("Arya");
		set.add("Anushka");
		set.add("Arya");
		
		for(String str : set)
		{
			System.out.println(str);
		}
	}
}
