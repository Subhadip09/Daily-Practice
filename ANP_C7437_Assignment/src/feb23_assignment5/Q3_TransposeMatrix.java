// Transpose the Matrix

package feb23_assignment5;

import java.util.*;

public class Q3_TransposeMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int matrix[][] = new int[n][m];
		
		for(int i = 0; i<n; i++)
		{
			for(int j = 0; j<m; j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}
		
		int tmatrix[][] = new int[m][n];
		
		for(int i = 0; i<m; i++)
		{
			for(int j = 0; j<n; j++)
			{
				tmatrix[i][j] = matrix[j][i];
			}
		}
		
		for(int i = 0; i<m; i++)
		{
			for(int j = 0; j<n; j++)
			{
				System.out.print(tmatrix[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
