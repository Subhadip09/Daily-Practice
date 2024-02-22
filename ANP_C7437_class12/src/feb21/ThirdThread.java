package feb21;

public class ThirdThread extends Thread {
	public void run() {
		// TODO Auto-generated method stub
		String name  = Thread.currentThread().getName() ;
		
		for (int i= 5000 ; i<5010 ; i++) {
			System.out.println(i +"----->"+ name);
		}
	}
}
