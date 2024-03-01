package feb29;

public class Main {
	public static void main(String[] args) {
		ThreadA t1 = new ThreadA();
		ThreadB t2 = new ThreadB();
		ThreadC t3 = new ThreadC();
		
		t1.start();
		t2.start();
		t3.start();
		// to execute runnable object
		ThreadD t4 = new ThreadD();
		Thread t = new Thread(t4); // passing runnable object to the constructor of Thread class
		t.start();
		
		for(int i = 51; i<=70; i++)
		{
			System.out.println("inside main method: "+ i);
		}
		System.out.println("end of main");
	}
}
