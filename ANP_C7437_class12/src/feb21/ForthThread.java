package feb21;

public class ForthThread {
	public static void main(String[] args) {
//		ThirdThread th = new ThirdThread();
//		th.start();
		
		//to execute SecondThread
		SecondThread sc = new SecondThread();
		
		Thread t1 = new Thread(sc);
		t1.start();
		
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sc.sum);
		
//		for(int i = 0; i<100; i++)
//		{
//			System.out.println(i + "main thread"+ Thread.currentThread().getPriority()); //Thread.currentThread().getPriority() is used to check the priority of the thread
//		}
	}
}
