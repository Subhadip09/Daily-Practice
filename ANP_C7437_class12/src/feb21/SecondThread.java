package feb21;

public class SecondThread implements Runnable{

	// 2 tarike hai multithreading ko execute krnek 
	// extends Thread class
	// implements runnable interface
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		for(int i =2000; i<2010; i++)
		{
			System.out.println(i + "----->" + name);
		}
	}
}
