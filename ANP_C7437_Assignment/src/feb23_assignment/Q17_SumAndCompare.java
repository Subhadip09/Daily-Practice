// sum & Compare

package feb23_assignment;

import java.util.*;

public class Q17_SumAndCompare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int one = sc.nextInt();
		int two = sc.nextInt();
		int three = sc.nextInt();
		int four = sc.nextInt();
		int five = sc.nextInt();
		
		int sum1 = one + two + three;
		int sum2 = four + five;
		
		System.out.println(sum1 > sum2);
	}
}
