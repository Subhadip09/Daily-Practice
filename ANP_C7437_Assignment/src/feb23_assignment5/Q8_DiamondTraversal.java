// Diamond Traversal

package feb23_assignment5;

import java.util.*;

public class Q8_DiamondTraversal {
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
				for(int k = N-1; k>=0; k--)
				{
					if(j-k == 1 || k-j == 1)
					{
						System.out.print(matrix[j][k] + " ");
					}
				}
			}
		}
	}
}
