package ichatcoding;

//import scanner class form java.util package
import java.util.Scanner;
//to get maximum element of an array make a class

public class PalindromeCheak {
	//main method
	public static void main(String[] args) {
		// creating object of scanner class
		Scanner sc = new Scanner(System.in);
		//Prompting user to enter the size of the array

        try {
            // Prompt the user to enter a string
            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            // Validate input
            if (input == null || input.isEmpty()) {
                System.out.println("Input is empty or null. Please provide a valid string.");
                return;
            }

            // Remove non-alphanumeric characters
            String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "");

            // Check if the cleaned input is empty
            if (cleanInput.isEmpty()) {
                System.out.println("The input string contains only non-alphanumeric characters.");
                return;
            }

            // Check if the cleaned input is a palindrome
            if (isPalindrome(cleanInput)) {
                System.out.println("The input string \"" + input + "\" is a palindrome.");
            } else {
                System.out.println("The input string \"" + input + "\" is not a palindrome.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Close the scanner object in a finally block
            sc.close();
        }
    }

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
