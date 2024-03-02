package feb29;

public class Main1 {
	public static void main(String[] args) {
		ThreadF t1 = new ThreadF();
		Thread tt = new Thread(t1);
		tt.start();
		System.out.println(t1.sum);
	}
}
