// Reverse Array Traversal

package feb23_assignment5;

import java.util.*;

public class Q4_ReverseArrayTraversal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i = 0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i = size-1; i>=0; i--)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
