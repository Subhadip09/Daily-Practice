package feb21;

//public class SecondThread extends ThirdThread implements Runnable{
public class SecondThread implements Runnable{
	// 2 tarike hai multithreading ko execute krnek 
	// extends Thread class
	// implements runnable interface
	
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		String name = Thread.currentThread().getName();
//		for(int i =2000; i<2010; i++)
//		{
//			System.out.println(i + "----->" + name);
//		}
//	}
	
	
	// we can conditionally suspend a thread using join() method
	int sum = 0;
	
	public void run() {
		for(int i = 1; i<=100; i++)
		{
			sum += i;
		}
		System.out.println(sum);
	}
}
