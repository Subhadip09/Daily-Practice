package feb19;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
	public static void main(String[] args) {
		// what is Set interface -- HashSet , LinkedHashSet, TreeSet
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
		// single null value allowed
		System.out.println(set);
		
		//LinkedHashSet
		// Suppose also you want to follow insertion order, then LinkedHashSet is used   
		LinkedHashSet<String> lset = new LinkedHashSet<>();
		lset.add("subhadip");
		lset.add("Subhadip");
		lset.add("surbhi");
		lset.add("aysuh");
		lset.add("nilesh");
		lset.add("nilesh");
		lset.add(null);
		lset.add(null);
		
		System.out.println(lset);
		
		//TreeSet
		//it maintains ascending order & does not allow null values
		TreeSet<String> tset = new TreeSet<> ();
		tset.add("subhadip");
		tset.add("Subhadip");
		tset.add("surbhi");
		tset.add("aysuh");
		tset.add("nilesh");
		tset.add("nilesh");
//		tset.add(null);
//		tset.add(null);
		
		System.out.println(tset);
		
		
		//Queue
		//follows First in First out mechanism & data will be remove from front
		System.out.println("<--------Queue-------->");
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("subhadip");
		pq.add("subhadip");
		pq.add("ayushi");
		pq.add("Subhasini");
		pq.add("anushka");
		pq.add("abhikarsh");
		System.out.println(pq.peek()); // will print the first element of sorted order
		System.out.println(pq.element());// another method to see the first element
		System.out.println(pq);
		// to remove data
		pq.remove();
		//another method for removing data from queue
		pq.poll();
		System.out.println(pq);
	}
}
