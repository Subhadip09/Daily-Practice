package lab4_feb16;

public class Exception1 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		
		try
		{
			for(int i = 0; i <= arr.length; i++)
			{
				System.out.println("Element at index "+ i +" is "+ arr[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Caught ArrayIndexOutOfBoundsException");
			e.printStackTrace();
		}
	}
}
