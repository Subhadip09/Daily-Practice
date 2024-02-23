// World Cup Final

package feb23_assignment;

import java.util.*;

public class Q4_WorldCupFinal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int NzScore = sc.nextInt();
		int NzSuperOver = sc.nextInt();
		int NzFours = sc.nextInt();
		
		int EngScore = sc.nextInt();
		int EngSuperOver = sc.nextInt();
		int EngFours = sc.nextInt();
		
		if(NzScore > EngScore)
		{
			System.out.println("New Zealand");
		}
		else if(NzScore < EngScore)
		{
			System.out.println("England");
		}
		else if(NzSuperOver > EngSuperOver)
		{
			System.out.println("New Zealand");
		}
		else if(NzSuperOver < EngSuperOver)
		{
			System.out.println("England");
		}
		else if(NzFours > EngFours)
		{
			System.out.println("New Zealand");
		}
		else if(NzFours < EngFours)
		{
			System.out.println("England");
		}
	}
}
