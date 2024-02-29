// Swastika & Sum

package feb27_assignment6;

import java.util.*;

public class Q4_SwastikaAndSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[][] = new int[n][m];
		
		for(int i = 0; i<n; i++)
		{
			for(int j = 0; j<m; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i = 0; i<n-1; i++)
		{
			for(int j = m-1; j>=0; j--)
			{
				if(j>2 && i==0)
				{
					sum1 = sum1 + arr[i][j];
				}
				else if(j == 2)
				{
					sum1 = sum1 + arr[i][j];
				}
				else if(i == 3 && j<2)
				{
					sum1 = sum1 + arr[i][j];
				}
			}
		}
		System.out.println(sum1);
	}
}
