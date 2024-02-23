// Odd, Even and Both

package feb23_assignment;

import java.util.*;

public class Q13_OddEvenAndBoth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int one = sc.nextInt();
		int two = sc.nextInt();
		
		if(one%2 == 0 && two%2 == 0)
		{
			System.out.println("Even");
		}
		else if(one%2 != 0 && two%2 != 0)
		{
			System.out.println("Odd");
		}
		else
		{
			System.out.println("Even-Odd");
		}
	}
}
