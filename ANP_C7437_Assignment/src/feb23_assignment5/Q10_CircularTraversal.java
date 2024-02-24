// Circular Traversal

package feb23_assignment5;

import java.util.*;

public class Q10_CircularTraversal {
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
			// 7 4 1
			for(int j = N-1; j>=0; j--)
			{
				System.out.print(matrix[j][0] + " ");
			}
			// 2 3
			for(int j = (N-1)/2; j<N; j++)
			{
				System.out.print(matrix[0][j] + " ");
			}
			// 6 9
			for(int j = (N-1)/2; j<N; j++)
			{
				System.out.print(matrix[j][N-1] + " ");
			}
			// 8
			for(int j = (N-1)/2; j<N-1; j++)
			{
				System.out.print(matrix[N-1][j]);
			}
		}
	}
}
