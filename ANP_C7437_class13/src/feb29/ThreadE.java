package feb29;

public class ThreadE implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String tname = Thread.currentThread().getName();
		for(int i = 101; i<=110; i++)
		{
			System.out.println(tname + " is running in ThreadE");
		}
	}
	
}
