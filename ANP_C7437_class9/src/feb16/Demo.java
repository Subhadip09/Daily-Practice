package feb16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Demo {
	public static void main(String[] args) {
//		ArrayList list = new ArrayList<>();
		
//		list.add(212323);
//		list.add("Subhadip");
//		list.add(true);
//		list.add('c');
//		System.out.println(list);
		
		Address a1 = new Address();
		a1.setCity("Kolkata");
		a1.setPincode("721651");
		a1.setState("WB");
		
		Student s1 = new Student(); //default constructor use ho rha hai
		s1.setName("Subhadip");
		s1.setId(12);
		s1.setAddress(a1);
		
		System.out.println(s1);
		
		Student s2 = new Student("Dip", 10, new Address("21345", "kolkata", "WB")); // parameterized constructor
		System.out.println(s2);
		
		Student s3 = new Student("Raj", 10, new Address("21345", "kolkata", "WB"));
		// to change the city of a student
		s3.getAddress().setCity("Mumbai");
		System.out.println(s3);
		
		
		Student s4 = new Student("Rajdip", 10, a1);
		System.out.println(s4);
		
		System.out.println();
		
		Student s5 = new Student("Matrix", 10, a1);
		System.out.println(s4);
		
		
		//to insert all the data in ArrayList
		//int [] arr = new int [8];
		Student [] arrOfStudent = new Student[8];
		arrOfStudent[0] = s1;
		arrOfStudent[1] = s2;
		arrOfStudent[2] = s3;
		
		for(Student ss : arrOfStudent)
		{
			System.out.println(ss);
		}
		int [] aa = new int [8];
		
		
		// ArrayList is used to group of object
		List<Student> shortList = new ArrayList<>();
		shortList.add(s2);
		shortList.add(s3);
		
		
		List<Student> list = new ArrayList<> (shortList);
//		boolean dataInserted = list.addAll(shortList);
		;
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		// to set value at particular index position in array
		list.add(2, s5); // ye kaam krna preferable nhi hai. bcz if  there data of 10000 students, if we put some value in position 5000, the rest 5000 data will be hamper. they will be shift one position age ki taraf. Due to this server will be down.
		
		// it can't be solve  by arrayList--> data manipulation k liye we don't use arrayList
		// ArrayList is not compatible for data manipulation
		// To perform any kind of manipulation into the data, whi8ch kind of datatype should be used? -> LinkedList
		
		//to remove data
		//suppose i want to remove s5 data
		list.remove(s5);
		//suppose i want to remove entire data of shortList
		list.removeAll(shortList);
		
		//suppose i want to get size of my list
		System.out.println(list.size());
		
		//suppose i want to yeah student hai ya nhi
		System.out.println(list.contains(s5)); // answer - false
		
		System.out.println("------ArrayList------");
		System.out.println(list);
		for(Student stu:list)
		{
			System.out.println("list print by forEach loop");
			System.out.println(stu);
			// to null all the city
			stu.getAddress().setCity(null);
			System.out.println(stu);
		}
		
		System.out.println();
		System.out.println();
		
		//LinkedList
		
		// 100 percent same as ArrayList but internally implementation is totally different , alag tarika seh data save ho rha hai    
		LinkedList<Integer> linklist = new LinkedList<>();
		linklist.add(12); // save in the form of node
		linklist.add(2);
		linklist.add(98);
		linklist.add(19);
		linklist.add(77);
		System.out.println("--------------LinkedList-------------");
		System.out.println(linklist);
		
		System.out.println();
		System.out.println();
		
		//Vector
		//more than one thread can't work on vector
		//bcz vector is synchronized, where synchronized comes in java-- there multi-threading is not possible
		
		Vector<String> vc = new Vector<> ();
		
		vc.add("Subhadip");
		vc.add("Piyush");
		vc.add("Ayush");
		vc.add("Nitin");
		vc.remove(3);
		System.out.println("--------------Vector-------------");
		System.out.println(vc);
		
		System.out.println();
		System.out.println();
		
		//Stack 
		//same as ArrayLList but it follows LIFO(last in first out)
		// jo last mai in ho rha hai wo sabse pahle out hoga
		// jo last mai aya hai wohi pehle jayega
		Stack<Integer> st = new Stack<>();
		st.add(23);
		st.add(33);
		st.add(65);
		st.add(886);
		st.add(986);
		System.out.println("--------------Stack--------------");
		System.out.println(st);
		// to delete the last data pop is used
		
		st.pop();
		st.pop();
		st.pop();
		// to show the last data peek is used
		System.out.println(st.peek());
		System.out.println(st);
	}
}
