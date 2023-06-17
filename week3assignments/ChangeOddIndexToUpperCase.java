package week3assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		String test="changeme";
		
		char[] charArray = test.toCharArray();
		
		String result="";
		for(int i=0;i<charArray.length;i++)
		{
			char d = charArray[i];
			String s = Character.toString(d);
			if(i % 2 != 0)
			{
				
				result=result+s.toUpperCase();
			}
			else
				result=result+s.toLowerCase();
	
		
		}	System.out.println(result);
	
	}

}
