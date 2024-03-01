package feb29;

public class ThreadC extends Thread{
	public void run()
	{
		for(int i = 31; i<=50; i++) {
			System.out.println("inside the run method of ThreadC: " + i);
		}
		System.out.println("end of ThreadC");
	}
}
