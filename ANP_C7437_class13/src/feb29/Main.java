package feb29;

public class Main {
	public static void main(String[] args) {
		ThreadA t1 = new ThreadA();
		ThreadB t2 = new ThreadB();
		ThreadC t3 = new ThreadC();
		
		t1.start();
		t2.start();
		t3.start();
		// to execute runnable object
		ThreadD t4 = new ThreadD();
		Thread tt = new Thread(t4); // passing runnable object to the constructor of Thread class
		tt.start();
		
		ThreadE t5 = new ThreadE();
		Thread ttt = new Thread(t5);
		Thread ttt1 = new Thread(t5);
		ttt.setName("Dip");
		ttt1.setName("Rick");
		ttt.start();
		ttt1.start();
		
		for(int i = 51; i<=70; i++)
		{
			System.out.println("inside main method: "+ i);
		}
		System.out.println("end of main");
	}
}
