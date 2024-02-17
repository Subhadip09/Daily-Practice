package feb16;

import java.util.ArrayList;
import java.util.List;

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
		boolean dataInserted = list.addAll(shortList);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		System.out.println("------ArrayList------");
		System.out.println(list);
		for(Student stu:list)
		{
			System.out.println("list print by forEach loop");
			System.out.println(stu);
		}
		
		
	}
}
