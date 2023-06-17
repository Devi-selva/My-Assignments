package week3assignments;


public class ReverseEvenWords {

	public static void main(String[] args) {
		
		String test = "I am a software tester"; 
		String[] split = test.split(" ");
		
		String result="";
		
		for (int i=0;i<split.length;i++)
		{
			if(i%2==0)
			{
			result= result+split[i]+" ";
			}	
			else
			{
				char[] charArray = split[i].toCharArray();
				
				for(int j=charArray.length-1;j>=0;j--)
				{
					
					result=result+charArray[j];
					
				}result=result+" ";
				
			}
				
		}System.out.println(result);
	}
}
		
		
		

	


