package feb21;

public class ThirdThread extends Thread {
	public void run() {
		// TODO Auto-generated method stub
		String name  = Thread.currentThread().getName() ;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i= 5000 ; i<5010 ; i++) {
			System.out.println(i +"----->"+ name);
		}
	}
}
