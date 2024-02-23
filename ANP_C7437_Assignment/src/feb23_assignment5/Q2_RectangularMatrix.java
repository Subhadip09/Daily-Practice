// Rectangular Matrix

package feb23_assignment5;

import java.util.*;

public class Q2_RectangularMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int m = sc.nextInt();
		int matrix[][] = new int[N][m];
		
		for(int i = 0; i<N; i++)
		{
			for(int j = 0; j<m; j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i<N; i++)
		{
			for(int j = 0; j<m; j++)
			{
				System.out.print(matrix[i][j] + 1 + " ");
			}
			System.out.println();
		}
	}
}
