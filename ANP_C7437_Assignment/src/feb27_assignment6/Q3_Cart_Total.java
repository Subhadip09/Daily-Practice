// Cart Total

package feb27_assignment6;

import java.util.*;

public class Q3_Cart_Total {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int price[] = new int[n];
		int quantity[] = new int[n];
		int total = 0;
		
		for(int i = 0; i<n; i++)
		{
			price[i] = sc.nextInt();
		}
		for(int i = 0; i<n; i++)
		{
			quantity[i] = sc.nextInt();
		}
		
		for(int i = 0; i<n; i++)
		{
			total = total + (price[i]*quantity[i]);
		}
		
		System.out.print(total);
	}
}
