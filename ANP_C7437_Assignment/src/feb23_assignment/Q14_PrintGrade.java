// Print Grade

package feb23_assignment;

import java.util.*;

public class Q14_PrintGrade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		
		if(total == 100)
		{
			System.out.println("A");
		}
		else if(total >= 90)
		{
			System.out.println("B");
		}
		else if(total >= 80)
		{
			System.out.println("C");
		}
		else
		{
			System.out.println("F");
		}
	}
}
