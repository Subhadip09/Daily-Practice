// Spiral Traversal

package feb23_assignment5;

import java.util.*;

public class Q9_SpiralTraversal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i = 0; i<T; i++)
		{
			int N = sc.nextInt();
			int M = sc.nextInt();
			int matrix[][] = new int[N][M];
			
			for(int j = 0; j<N; j++)
			{
				for(int k = 0; k<M; k++)
				{
					matrix[j][k] = sc.nextInt();
				}
			}
			
			// 1 5 9
			for(int j = 0; j<N; j++)
			{
				System.out.print(matrix[j][0] + " ");
			}
			// 10 11 12
			for(int j = (M-1)/2; j<M; j++)
			{
				System.out.print(matrix[N-1][j] + " ");
			}
			// 8 4
			for(int j = (N-1)-1; j>=0; j--)
			{
				System.out.print(matrix[j][M-1] + " ");
			}
			
			// 3 2
			for(int j = (M-1)-1; j>0; j--)
			{
				System.out.print(matrix[0][j] + " ");
			}
			
			// 6 7
			for(int j = (N-1)/2; j<=(N-1)-1; j++)
			{
				for(int k = (M-1)/2; k<=M/2; k++)
				{
					System.out.print(matrix[j][k] + " ");
				}
			}
//			
		}
	}
}
