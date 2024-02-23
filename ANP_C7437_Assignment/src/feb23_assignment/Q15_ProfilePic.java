// profile Pic

package feb23_assignment;

import java.util.*; 

public class Q15_ProfilePic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int W = sc.nextInt();
		
		int length = sc.nextInt();
		int width = sc.nextInt();
		
		if(length > L && width > W)
		{
			System.out.println("Upload");
		}
		else if(length < L)
		{
			System.out.println("Increase Length");
		}
		else if(width < W)
		{
			System.out.println("Increase Width");
		}
	}
}
