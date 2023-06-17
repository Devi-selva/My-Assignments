package week3assignments;

import java.util.LinkedHashSet;

public class MissingNumber {

	public static void main(String[] args) {

		int[] num = {1,2,3,4,6,7,8,9,10};
		
		int len= num.length;
		
		LinkedHashSet<Integer> Series= new LinkedHashSet<Integer>();
		
		for (int i = 0;i<len-1;i++)
		{
			Series.add(num[i]);
		}
		
		System.out.println(Series);
		for (int i = 1; i <= len-1; i++) {
	        // If integer is not in hashset, it is the missing integer
	        if (!Series.contains(i)) {
	           System.out.println(i);
	        }
	    }
		
		
		}
	
		
		
	}







