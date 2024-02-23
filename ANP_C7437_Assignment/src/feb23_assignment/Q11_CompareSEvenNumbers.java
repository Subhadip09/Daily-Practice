// Compare seven Numbers
package feb23_assignment;

import java.util.*;

public class Q11_CompareSEvenNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		int g = sc.nextInt();
		
		int sum1 = (a + b) * c;
		int sum2 = (d + e + f + g);
		
		System.out.println(sum1 > sum2);
	}
}
