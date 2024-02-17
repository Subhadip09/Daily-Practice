package feb14;

public class TestExceptionPropagation {
	void m()
	{
		System.out.println("first line of method m");
		int data = 50/0; //code faat gya
		System.out.println(data);
		System.out.println("last line of method m");
	}
	void n()
	{
		System.out.println("first line of method n");
		m();
		System.out.println("last line of method n");
	}
	void p()
	{
		System.out.println("first line of method p");
		try {
			n();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("This block will always execute");
		}
		System.out.println("last line of method p");
	}
	
	public static void main(String[] args) {
		System.out.println("first line of main method");
		TestExceptionPropagation obj = new TestExceptionPropagation();
		obj.p();
		
		obj = null;
		
		System.out.println("last line of main method");
		
		System.gc();
	}
	
	public void finalize()
	{
		System.out.println("just before garbage collected");
	}
}
