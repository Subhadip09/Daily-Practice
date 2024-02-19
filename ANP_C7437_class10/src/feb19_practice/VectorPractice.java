package feb19_practice;

import java.util.*;

public class VectorPractice {
	public static void main(String[] args) {
		Vector<String> vc = new Vector<>();  
		vc.add("Subhadip");  
		vc.add("Amit");  
		vc.add("Ashish");  
		vc.add("Garima");  
		
		for(String str : vc)
		{
			System.out.println(str);
		}
	}
}
