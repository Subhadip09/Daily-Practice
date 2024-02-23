// Two Sums One Number
// You are given five numbers, stored in the variables with the following names 
// one, two, three, four, five
// Find the value of sum1 & sum2, such that, sum1 = one + two,  sum2 = three + four
// If the value of both sum1 & sum2 is greater than the value stored in variable five, 
// print "Yes", else "No"
package feb23_assignment;

import java.util.*;

public class Q3_TwoSumsOneNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int one = sc.nextInt();
		int two = sc.nextInt();
		int three = sc.nextInt();
		int four = sc.nextInt();
		int five = sc.nextInt();
		
		int sum1 = one + two;
		int sum2 = two + four;
		
		if(sum1 > five && sum2 > five)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}
