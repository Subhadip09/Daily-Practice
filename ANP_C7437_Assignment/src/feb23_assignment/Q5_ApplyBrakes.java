// Apply Brakes
// You are given two numbers stored in the variable with the names distance, time
// Find the value of the speed such that,
// speed = distance/time
// If the following expression is true
// speed > 40, print "Apply Brake" else print "Keep Going"
// Print the statement without quotes
package feb23_assignment;

import java.util.*;

public class Q5_ApplyBrakes {	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int distance = sc.nextInt();
		int time = sc.nextInt();
		
		double speed = distance/time;
		if(speed > 40)
		{
			System.out.println("Apply Brake");
		}
		else 
		{
			System.out.println("Keep Going");
		}
	}
}