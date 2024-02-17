package feb16;

import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
//		ArrayList list = new ArrayList<>();
		
//		list.add(212323);
//		list.add("Subhadip");
//		list.add(true);
//		list.add('c');
//		System.out.println(list);
		
		Address a1 = new Address();
		a1.setCity("Indore");
		a1.setPincode("721651");
		a1.setState("WB");
		
		Student s1 = new Student(); //default const use ho rha hai
		s1.setName("Subhadip");
		s1.setId(12);
		s1.setAddress(a1);
		
		System.out.println(s1);
		
		Student s2 = new Student("Dip", 10, new Address("21345", "kolkata", "WB"));
		System.out.println(s2);
		
		Student s3 = new Student("Raj", 10, a1);
		System.out.println(s3);
		
		Student [] arrOfStudent = new Student[8];
		arrOfStudent[0] = s1;
		arrOfStudent[1] = s2;
		arrOfStudent[2] = s3;
		
		for(Student ss : arrOfStudent)
		{
			System.out.println(ss);
		}
		int [] aa = new int [8];
	}
}
