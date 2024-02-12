package feb9;

public class Counter {
	//int count = 0;
	static int count =0;
	
	public Counter ()
	{
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		Counter c4 = new Counter();
	}
}
