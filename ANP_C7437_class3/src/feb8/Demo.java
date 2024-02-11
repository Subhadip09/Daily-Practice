package feb8;

public class Demo {
	public static void main(String[] args)
	{
		Student obj1 = new Student(12, "Raju", 90);
		Student obj2 = new Student(12, "Raju Babu", 90);
		
		// equals()
		System.out.println(obj1.equals(obj2));
		
		// hashCode()
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		// two different string have same hashCode
		
		String p1 = "Aa";
		String p2 = "BB";
		
		System.out.println(p1.hashCode());
		System.out.println(p1.equals(p2));
		System.out.println(p2.hashCode());
		
		// Inheritance
		
		Employee emp = new FrontEnd();
		emp.id = 344;
		emp.name = "raja";
		System.out.println(emp.salary());
		
		Employee emp1 = new FullStack();
		emp1.id = 412;
		emp1.name = "ram";
		System.out.println(emp1.salary());
		
		// Compile Time Polymorphism
		
		FrontEnd fr = new FrontEnd();
		int sum = fr.add(12, 13);
		System.out.println(sum);
		
		// abstract class
		Whatsapp app = new Whatsappimplementation();
		app.icon();
		app.sendMessage();
	}
	
	
}
