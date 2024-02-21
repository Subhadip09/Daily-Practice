package feb20;

import java.util.ArrayList;
import java.util.Collections;

public class Basic {
	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Raju", 60000);
		Employee e2 = new Employee(2, "Manish", 69000);
		Employee e3 = new Employee(3, "Subu", 68000);
		Employee e4 = new Employee(4, "Subham", 65000);
		Employee e5 = new Employee(5, "Zara", 69000);
		
		ArrayList<Employee> li = new ArrayList<> ();
		li.add(e4);
		li.add(e2);
		li.add(e3);
		li.add(e1);
		li.add(e5);
		System.out.println(li);
		
		// to compare two employee
//		if(e4 > e3) //we can't compare two object like this
//		{
//			System.out.println("e4 is greater");
//		}
		
		// to sort list
		Collections.sort(li, new NameComparator()); //compare on the basis of name
		System.out.println(li);
		Collections.sort(li, new IdComparator()); //Compare on the basis of EmpId
		System.out.println(li);
		
		Collections.sort(li, new NameAndSalaryComparator());;
		System.out.println(li);
		// to compare two employee objects "comparable" interface is used
		
	}
}

