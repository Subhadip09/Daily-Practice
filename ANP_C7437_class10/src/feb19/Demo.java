package feb19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Demo {
	
	public static void reverseString(String ss)
	{
		// you have to reverse a string using stack
		// string to stack mai character data type k form mai store karlo
		// then ek dusre string mai ek ek data ko pop out kark add krdo
		
		
		char[] charArray = ss.toCharArray();
//		
//		List<char[]> l = Arrays.asList(charArray);
//		System.out.println(l);
//		
//		ArrayList<Character>  cc = new ArrayList<> ();
		
		// stack k constructor list type k data lega
		Stack<Character> st = new Stack<>();
		
		for(Character c: charArray)
		{
			st.push(c);
		}
		System.out.println(st);
		
		String reversest = "";
		
		while(st.isEmpty() == false || st.size() != 0) {
			reversest = reversest+st.pop();
		}
		System.out.println(reversest);
 	}
	public static void main(String[] args) {
		reverseString("subhadip"); //pidahbus
		
		// check palindrome
		// check anagram
		// {2,4,5,6,7,8,9}k = 11  
	}
}
