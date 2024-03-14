package ichatcoding;
//import scanner class form java.util package
import java.util.Scanner;
//to get maximum element of an array make a class
public class MaxElementInArray {
	//main method
	public static void main(String[] args) {
		// creating object of scanner class
		Scanner sc = new Scanner(System.in);
		//Prompting user to enter the size of the array
		int size = 0;
	    while (size <= 0) {
	        try {
	           System.out.print("Enter the size of the array: ");
	           size = sc.nextInt();
	           if (size <= 0) {
	              System.out.println("Please enter a positive integer for the size of the array.");
	           }
	        } catch (Exception e) {
	              System.out.println("Invalid input. Please enter a valid integer.");
	              sc.nextLine(); // Consume the invalid input
	        }
	    }
		//Creating an array of given size
		int array[] = new int[size];
		//Prompting user to enter the elements of array
		System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++)
        {
            boolean validInput = false;
            while (!validInput)
            {
                try {
                    array[i] = sc.nextInt();
                    validInput = true;
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    sc.nextLine(); // Consume the invalid input
                }
            }
        }
		int maxElement = findMaxElement(array, size);
		// Printing the result 
		System.out.println("Maximum element in the array is: " + maxElement);
	}
	private static int findMaxElement(int[] array, int size) {
		//Taking the first element of the array as maximum element
		int max = array[0];	
		//By a taking the first element as maximum finding the maximum element
		for(int i = 1; i < size; i++)
		{
			if(array[i] > max)
			{
				max = array[i];
			}
		}
		return max;
	}
}
