// Enough Fuel Consumption
// You are given two numbers, stored in the variable with the following names
// fuel, distance
// Find the value of required, such that
// required = fuel * distance
// If the value of required is greater than 50, print "Enough", else print "Go On"
package feb23_assignment;

import java.util.*;

public class Q1_EnoughFuelConsumption {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fuel = sc.nextInt();
		int distance = sc.nextInt();
		
		int required = fuel * distance;
		
		if(required > 50)
		{
			System.out.println("Enough");
		}
		else
		{
			System.out.println("Go On");
		}
	}
}
