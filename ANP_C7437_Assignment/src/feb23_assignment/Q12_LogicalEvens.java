// LogicalEvens

package feb23_assignment;

import java.util.*;

public class Q12_LogicalEvens {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int one = sc.nextInt();
		int two = sc.nextInt();
		
		if(one%2 == 0 && two%2 == 0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}
