// Traverse a 2d Array

package feb23_assignment5;

import java.util.*;

public class Q5_Traverse2dArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int matrix[][] = new int[N][M];
		
		for(int i =0; i<N; i++)
		{
			for(int j = 0; j<M; j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}
		
		for(int i = M-1; i>=0; i--)
		{
			for(int j = 0; j<N; j++)
			{
				System.out.print(matrix[j][i] + " ");
			}
		}
	}
}
