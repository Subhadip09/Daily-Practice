package feb29class;

public class Main {
public static void main(String[] args) {
		
//		Common c1  = new Common() ;// c1 object ka ek lock hai 
		
		
		Common c  = new Common() ;
		// Sharing same common object to two thread 
		ThreadA a  = new ThreadA(c , "sachin") ;
		
		ThreadB b  = new ThreadB(c , "POOJA" ) ;
		
		a.start(); 
		b.start();
		
		//static synch  ko access karne k liye you need class level lock 
			
	}
}
