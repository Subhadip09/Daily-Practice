package feb9;

public class Basic {
	public static void main(String[] args) {
		System.out.println("start");
		//
		//
//		int a = 12/0; //code faat gya
//		System.out.println(a);
		try {
			int a = 12/0;
			System.out.println(a);
		}
		catch(Exception e)
		{
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		//
		//
		System.out.println("end");
	}
}
