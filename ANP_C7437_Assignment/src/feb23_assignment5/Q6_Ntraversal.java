// N Traversal

package feb23_assignment5;

import java.util.*;

public class Q6_Ntraversal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i = 0; i<T; i++)
		{
			int N = sc.nextInt();
			int matrix[][] = new int[N][N];
			
			for(int j = 0; j<N; j++)
			{
				for(int k = 0; k<N; k++)
				{
					matrix[j][k] = sc.nextInt();
				}
			}
			
			for(int j = N-1; j>=0; j--)
			{
		
				System.out.print(matrix[j][0] + " ");
			}
			
			for(int j = 1; j<N; j++)
			{
				for(int k = 1; k<N; k++)
				{
					if(j == k)
					{
						System.out.print(matrix[j][k] + " ");
					}
				}
			}
			
			for(int j = 1; j>=0; j--)
			{

				System.out.print(matrix[j][2] + " ");
			}
		}
	}
}
