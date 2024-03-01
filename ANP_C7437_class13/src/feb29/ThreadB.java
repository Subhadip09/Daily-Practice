package feb29;

public class ThreadB extends Thread{
	public void run()
	{
		for(int i = 21; i<=30; i++)
		{
			System.out.println("inside the run method of ThreadB: " + i);
		}
		System.out.println("end of ThreadB");
	}
}
