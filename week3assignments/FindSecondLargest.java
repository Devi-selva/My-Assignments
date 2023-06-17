package week3assignments;

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class FindSecondLargest {

	public static void main(String[] args) {

		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
		Set<Integer> data1= new TreeSet<Integer>();
		for (int i: data)
		{
			data1.add(i);
		}
		
		System.out.println(data1);
		List<Integer>data2= new ArrayList<Integer>(data1);
		Collections.sort(data2);		
		
		int lSize=data2.size();
		int second=data2.get(lSize-2);
		System.out.println(lSize);
		System.out.println(second);
		
	
	}

}
