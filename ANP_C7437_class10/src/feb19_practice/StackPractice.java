package feb19_practice;

import java.util.*;

public class StackPractice {
	public static void main(String[] args) {
		Stack<String> st = new Stack<>();
		st.add("Rajat"); // we can also use push to add objects
		st.add("Amit");
		st.add("Roshan");
		st.add("Piyush");
		
		System.out.println(st);
		
		st.pop();
		System.out.println(st);
		// to check the top element of the stack
		System.out.println("Top element of the stack is: "+st.peek());
	}
}
