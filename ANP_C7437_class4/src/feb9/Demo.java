package feb9;

public class Demo {
	public static void main(String[] args)
	{
		// abstract class
		Whatsapp app = new WhatsappImplementation();
		app.icon();
		app.sendMessage();
		
		// Whatsapp app1 = new Whatsapp(); //--> we can't create object of an abstract class
		// we cant't create object of an abstract class. we have to put abstract keyword in front of a class.In this way it makes a class abstract.
		// we have to put some abstract method() in the abstract class
		
		// Static method
		// static method ko call karne k liye aapko object banane k jarurat nhi hai.
		// inko class k name se hi call kr sakte hai
		Whatsapp.status();
	}
}
