package feb29;

public class MultiThread extends Thread{
	public void run()
	{
		for(int i = 20; i<=30;i++)
		{
			System.out.println("Subhadip");
		}
	}
	
	public static void main(String[] args) {
		// here one thread (main)
		MultiThread obj = new MultiThread();
		
		// obj.run(); // it will be called as a normal method
		obj.start();//here second thread will start
		
		for(int i = 0; i<20; i++)
		{
			System.out.println("Rick");
		}
		
	}
}
