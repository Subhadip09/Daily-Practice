package feb19_practice;

import java.util.*;

public class HashSetPractice {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("Ishika");
		set.add("Arya");
		set.add("Anushka");
		set.add("Arya");
		set.add(null);
		set.add(null);
		
		for(String str : set)
		{
			System.out.println(str);
		}
	}
}
