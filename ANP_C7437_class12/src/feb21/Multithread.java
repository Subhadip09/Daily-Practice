package feb21;

public class Multithread extends Thread{
	//thread is a subprocessor
	// kya kre ki ek or thread
	public void run()
	{
		String name = Thread.currentThread().getName();
		for(int i = 250; i<=500; i++)
		{
			System.out.println(i + "Second thread" + name);
		}
	}
	 public static void main(String[] args) {
		String name = Thread.currentThread().getName();
		
		System.out.println(name);
		Multithread t1 = new Multithread();
		// to set a thread name
		t1.setName("Subhadip");
		
//		t1.run();// it will behave as single thread
		
		// to execute both thread start method is used
		t1.start(); // second thread execute start which is in this class
		
		// runnable 
		// to execute the runnable interface class Thread class k vi object banana padega
		SecondThread t2 = new SecondThread();
		Thread thread2 = new Thread(t2);
		thread2.setName("Matrix");
		thread2.start();
		
		// extends thread class
		ThirdThread t3  = new ThirdThread() ;
		t3.setName("Demon Thread");
		t3.start();
		
		
		for(int i = 0; i<250; i++)
		{
			System.out.println(i + "main thread"+ Thread.currentThread().getPriority()); //Thread.currentThread().getPriority() is used to check the priority of the thread
		}
	}
}
