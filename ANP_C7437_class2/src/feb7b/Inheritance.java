package feb7b;

public class Inheritance {
	public static void main(String args[]){  
		//Single/Simple Inheritance
		System.out.println("Simple or Single Inheritance");
		B obj=new B(); 
		obj.superclass();
		obj.subclass1();
		
		System.out.println();
		
		//Multilevel Inheritance
		System.out.println("Multilevel Inheritance");
		C obj1=new C(); 
		obj1.superclass();
		obj1.subclass1();
		obj1.subclass2();
		
		System.out.println();
		
		//Hierarchical Inheritance
		System.out.println("Hierarchical Inheritance");
		B obj2=new B();
		D obj3=new D();
		obj2.superclass();
		obj2.subclass1();
		obj3.superclass();
		obj3.subclass3();
	}
}
