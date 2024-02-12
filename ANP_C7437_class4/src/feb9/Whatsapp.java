package feb9;

public abstract class Whatsapp {
	// abs class main aap abstract method likh sakte ho
	
		public abstract void sendMessage();
		
		// concrete method
		public void icon() {
			System.out.println("Green Color");
		}
		
		// static method
		
		public static void status()
		{
			System.out.println("Subhadip k saree status aa gye");
		}
		
		// Constractor
		// As we can't create object of abstract class, is there have any constructor?
		// Yes, Constructor should be there.
		// Chahe is ka object nhi banega, but iska constructor present hai
		// Reason --> kyu ki jab aap child class(WhatsappImplementation.java) ka constructor banaoge 
		// or nhi banaoge, tab uss(child) constructor k first keyword by default super() likha hai,
		// iska matlab hai ki, parent ke constructor ko call kr rha hai. Isliye parent class mai constructor hoga hi.
		
		
		private Whatsapp(int speed) // private constructor
		{
			System.out.println("Meri speed hai "+speed);
		}
		
		public Whatsapp() // default constructor
		{
			this(200);
			System.out.println("Mai hu Abstract class k constructor");
		}
		
		
}
