package feb29;

public class ThreadF implements Runnable{
	int sum = 0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 0; i<=100; i++)
		{
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
