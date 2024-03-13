package ichatcoding;
//import scanner class form java.util package
import java.util.Scanner;
//to get factorial of a given number make a class
public class FactorialOfGivenNumber {
	//main method
	public static void main(String[] args) {
		// creating object of scanner class
		Scanner sc = new Scanner(System.in);
		
		try {
            // Prompt the user to enter a number
            System.out.print("Enter a number to calculate its factorial: ");
            
            // Validate input
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                return;
            }

            int number = sc.nextInt();

            // Validate input for negative numbers
            if (number < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
                return;
            }

            // Calculate factorial
            long factorial = calculateFactorial(number);
            System.out.println("The factorial of " + number + " is: " + factorial);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Close the scanner object in a finally block
            sc.close();
        }
		
		
	}
	//creating method to calculate factorial
	private static long calculateFactorial(int number) 
	{	
		long result = 1; 
		for(int i = 2; i <= number; i++) 
		{ 
			result *= i; 
		} 
		// returning the result
		return result; 
	}
}
