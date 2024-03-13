package ichatcoding;

//import scanner class form java.util package
import java.util.Scanner;
// to add two numbers make a class
public class AddTwoNumbers {
	// main method
	public static void main(String[] args) {
		// creating object of scanner class
		Scanner sc = new Scanner(System.in);
		// Prompting user to enter the first number
		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();
		// Prompting the user to enter the second number
		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();
		// Adding two numbers
		int sum = num1 + num2;
		// Printing the result
		System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
	}
}
