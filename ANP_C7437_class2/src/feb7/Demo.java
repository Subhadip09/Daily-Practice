package feb7;

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
		
		System.out.println(p2.hashCode());
	}
}
