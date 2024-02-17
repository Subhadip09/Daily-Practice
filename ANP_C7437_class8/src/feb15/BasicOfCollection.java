package feb15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BasicOfCollection {
	public static void main(String[] args) {
		// you have to create a simple array of index 5
		// and you have to insert a value
		// then you have to print
		
		//{0,1,2,3,4}
		//{0,0,0,0,0}--> initial value of array
		int[] arr = new int [5];
		//to insert values in array
		arr[0] = 21;
		arr[1] = 12;
		arr[2] = 14;
		arr[3] = 10;
		arr[4] = 22;
		// array is static in size. we can't change size after initialization
		
		//to print array use forEach loop
		for(int a: arr)
		{
			System.out.println(a);
		}
		//another way to print array
		System.out.println(Arrays.toString(arr));
		
		// another way to initialize an array
		int arr1[] = {2,3,5,6,8};
		arr1[2] = 7;
		System.out.println(Arrays.toString(arr1));
		
		//ArrayList
		
		List<Integer> list = new ArrayList<> ();
		
		list.add(23);
		list.add(23);
		list.add(23);
		list.add(343);
		list.add(77);
		list.add(null);
		list.add(null);
		list.add(null);
		list.add(90);
		System.out.println("ArrayList is: ");
		System.out.println(list);
		
		//HashSet
		Set<Integer> list1 = new HashSet<> ();
		
		list1.add(23);
		list1.add(23);
		list1.add(23);
		list1.add(343);
		list1.add(77);
		list1.add(null);
		list1.add(null);
		list1.add(null);
		list1.add(90);
		System.out.println("HashSet is: ");
		System.out.println(list1);
	}
}
