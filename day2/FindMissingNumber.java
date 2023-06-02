package week1.day2;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class FindMissingNumber {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,6,8};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int count = arr.length;
		for(int i=1; i<count; i++)
		{
			
			if(i!=arr[i-1])
			{			
				System.out.println("Missing numbers are: " +i);
				break;
				
			}
			
		
		}
}
}
	


