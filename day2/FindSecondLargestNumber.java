package week1.day2;

import java.util.Arrays;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7,15,14};
		Arrays.sort(data);
		System.out.println(Arrays.toString(data));
		int count = data.length;
		System.out.println("Second largest number is: " +data[count-2]);

	}

}
