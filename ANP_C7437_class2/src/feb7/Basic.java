package feb7;

public class Basic {
	public static void main(String[] args)
	{
		
		
		// Access modifier - 4 types(private, public, default, protected)
		// private --> accessible only in that class
		// public --> accessible all over the project & in all packages
		// default --> accessible with in package only
		// protected --> same package or to access in other package then that class will be child class
		
		
//		Student s = new Student();
//		s.setStudentId(12);
//		int id = s.getStudentId();
//		System.out.println(id);
		//*****************
//		Employee obj1 = new Employee(1,"Ram","10000");
//		Employee obj2 = new Employee(2,"Raj","30000");
//		Employee obj3 = new Employee(3,"Shyam","90000");
//		Employee obj4 = new Employee(4,"Ramu","100000");
//		Employee obj5 = new Employee(5,"Rick","1000");
//		
//		System.out.println(obj1);
//		System.out.println(obj2);
//		System.out.println(obj3);
//		System.out.println(obj4);
//		System.out.println(obj5);
		
		System.out.println("Employee ka kaam suru");
		
		Employee sa = new FrontEnd();
		sa.id = 344;
		sa.name = "raja";
		System.out.println(sa.salary());
		
		
	}
}
