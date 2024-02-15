package feb15;

import java.util.Arrays;

public class TestArray {
	public static void main(String args[]){  
		//you have to create a simple array of index 5
		//and you have to insert a value
		//then print
		//0,1,2,3,4
		//{0,0,0,0,0}
		
		int arr[]= new int [5];
		arr[0] = 12;
		arr[1] = 13;
		arr[2] = 14;
		arr[3] = 2323;
		arr[4] = 90;
		// it is static in size. i can't change size after initialization
		
//		for(int a : arr) //forEach
//		{
//			System.out.println(a);
//		}

		int arr1[] = {7,8,9,5,4,3};
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr));
	}
}
