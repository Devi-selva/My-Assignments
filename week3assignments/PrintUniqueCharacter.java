package week3assignments;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class PrintUniqueCharacter {

	public static void main(String[] args) {

		String name= "Deeksha";
		String result="";
		
		char[] charArray= name.toCharArray() ;
		
		LinkedHashSet<Character> name1= new LinkedHashSet<Character>();
		
		for (Character c:charArray)
		{
			name1.add(c);
		}
		System.out.println(name1);
		
		for (Character c: name1)
		{
		result=result+c;
		}
		
		System.out.println(result);
	}

}
