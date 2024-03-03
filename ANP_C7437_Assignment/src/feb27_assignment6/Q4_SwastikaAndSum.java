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
		
		for(int i = 0; i<n; i++)
		{
			for(int j = 0; j<m; j++)
			{
				if((i==0 && j>(m-1)/2) || (i==n-1 && j<(m-1)/2))
				{
					sum1 += arr[i][j];
				}
				else if(j==(m-1)/2)
				{
					sum1 += arr[i][j];
				}
			}
		}
		
		for(int i = 0; i<n; i++)
		{
			for(int j = 0; j<m; j++)
			{
				if((j==0 && i<(n-1)/2) || (j==m-1 && i>(n-1)/2))
				{
					sum2 += arr[i][j]; 
				}
				else if(i == (n-1)/2)
				{
					sum2 += arr[i][j];
				}
			}
		}
		System.out.println(sum1 - sum2);
	}
}
