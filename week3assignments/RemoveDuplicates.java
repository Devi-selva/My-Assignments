package week3assignments;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		
				
//Declare a String as "PayPal India"
		String Company= "PayPal India";
		char[] charArray = Company.toCharArray();
		Set<Character> charSet= new LinkedHashSet<Character>();
		Set<Character> dupCharSet= new LinkedHashSet<Character>();
		
		for(Character c:charArray)
		{
			charSet.add(c);
			
		
			if(!charSet.add(c))
			{
				dupCharSet.add(c);
			}
		}
		
		List<Character> Ls1= new ArrayList<Character>(charSet);
		
		for (int i=0; i<Ls1.size();i++)
		{
			char charValue = Ls1.get(i).charValue();
		    System.out.println(charValue);
			
		}
		}
	}




