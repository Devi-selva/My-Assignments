package week3assignments;

import java.util.LinkedHashSet;

public class RemoveDuplicateWords {

	public static void main(String[] args) {

		String text ="We learn java basics as part of java sessions in java week1";
		String[] Arr=text.split(" ");
		int len= Arr.length;
		//System.out.println(Arr[1]);
		
		LinkedHashSet<String> text1= new LinkedHashSet<String>();
		
		for (int i=0; i<len;i++)
		{
		
		text1.add(Arr[i]);
		
	}
		String result="";
		for (String Word:text1)
		{
			result= result+Word+" ";
			
		}
		
		System.out.println(result);
		
}
}
