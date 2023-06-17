package week3assignments;

public class Palindrome {

	public static void main(String[] args) {
		
		String val1= "madam";
		String rev="";
		char[] charArray = val1.toCharArray();
		
		int n= charArray.length;
		for (int i=n-1;i>=0;i--)
		{
			rev=rev+charArray[i];
			
		}System.out.println(rev);
		
		if(val1.equals(rev))
		{
			System.out.println("The String is palindrom");
		}
		else
			System.out.println("The String is not palindrom");

	}

}
