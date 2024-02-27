// Count Digits

package feb27_assignment6;

import java.util.*;

public class Q1_Count_Digits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int count0 = 0, count1 = 0, count2 = 0;
		for(int i = 0; i<n; i++)
		{
			if(arr[i] == 0)
			{
				count0++;
			}
			else if(arr[i] == 1)
			{
				count1++;
			}
			else if(arr[i] == 2)
			{
				count2++;
			}
		}
		System.out.print(count0 + " " + count1 + " " + count2 + " ");
	}
}
