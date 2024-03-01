package feb29;

public class ThreadA extends Thread{
	public void run()
	{
		for(int i=0; i<=20; i++)
		{
			System.out.println("inside the run method of ThreadA: " + i);
		}
		System.out.println("end of ThreadA");
	}
}
