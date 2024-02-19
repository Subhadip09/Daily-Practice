package feb19;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {
	public static void main(String[] args) {
		// what is Set interface -- hashset , linked hashset, treeset
		Set<Integer> set = new HashSet<>();
		set.add(23);
		set.add(52);
		set.add(87);
		set.add(9);
		set.add(52);
		set.add(67);
		set.add(null);
		set.add(null);
		// duplicate data will be removed & insertion order would not be followed 
		System.out.println(set);
	}
}
