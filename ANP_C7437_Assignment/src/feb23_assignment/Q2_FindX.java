// Find X
// You are given a no. x. Find the value of x, if
// 1. X is multiplied by 3
// 2. 10 is added to the new value of x

package feb23_assignment;

import java.util.*;

public class Q2_FindX {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		x = x * 3 + 10;
		
		System.out.println(x);
	}
}
