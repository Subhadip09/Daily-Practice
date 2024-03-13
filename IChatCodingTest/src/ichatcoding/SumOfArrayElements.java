package ichatcoding;

//import scanner class form java.util package
import java.util.Scanner;
//to add two numbers make a class
public class SumOfArrayElements {
	// main method
	public static void main(String[] args) {
		// creating object of scanner class
		Scanner sc = new Scanner(System.in);
		// Prompting user to enter the size of the array
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		// Creating an array of the given size
		int[] array = new int[size];
		// Prompting user to enter all the elements of array
		System.out.println("Enter the array elements: ");
		for(int i = 0; i < size; i++)
		{
			array[i] = sc.nextInt();
		}
		
		// Defining a variable to store the result of sum
		int sum = 0;
		// Calculating the sum of all elements
		for(int i = 0; i < size; i++)
		{
			sum = sum + array[i];
		}
		
		// Printing the result
		System.out.println("Sum of all elements of the array is: " + sum);
	}
}
