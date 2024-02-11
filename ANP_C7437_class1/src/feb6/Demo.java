package feb6;

public class Demo {
	//main ---- ctrl+space
	public static void batchStrength() {
		System.out.println("24 log");
	}
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int s = 456789; //litarel - byte, short, int, long-integer types of value, double, float-point value
		int ss = 4323;
		
		int ssss = s+ss;
		byte bb = 32; // for small value-less than 128
		double bccc = 32.23;
		
		System.out.println(ssss);
		
		
		Integer sp =34;
		
		Student stu = new Student();
		stu.id = 9211;
		stu.name = "Subha";
		stu.lunch();
		System.out.println(stu.id +"---->"+ stu.name);
		batchStrength();
		
	}
	// Primitive Data Type : Wrapper Classes
		// byte : java.lang.Byte
		// short : java.lang.Short
		// int : java.lang.Integer
		// long : java.lang.Long
		// float : java.lang.Float
		// double : java.lang.Double
		// char : java.lang.Character
		// boolean : java.lang.Boolean
	
	
	// naming ----
	// class name would be starting with Upper
	// method name starting with small --> student
	// main method & function will be end with ()
	// camel case or dusara pascal case --> StudentCharacterCertificate
	
}
