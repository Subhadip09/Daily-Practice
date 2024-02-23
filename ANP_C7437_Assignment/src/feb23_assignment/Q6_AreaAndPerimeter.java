// Area and Perimeter

package feb23_assignment;

import java.util.*;

public class Q6_AreaAndPerimeter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L1 = sc.nextInt();
		int B1 = sc.nextInt();
		
		int L2 = sc.nextInt();
		int B2 = sc.nextInt();
		
		int areaOfRect1 = L1 * B1;
		int areaOfRect2 = L2 * B2;
		
		int perimeterOfRect1 = 2 * (L1 + B1);
		int perimeterOfRect2 = 2 * (L2 + B2);
		
		System.out.println(areaOfRect1 > areaOfRect2);
		System.out.println(perimeterOfRect1 > perimeterOfRect1);
	}
}
