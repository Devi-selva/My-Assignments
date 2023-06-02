package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=100; int count=0;int i;
		for ( i=1; i<=n; i++)
		{
			if (n%i==0) {
				
				count++;	
				
		}
		
			if (count==2) 
			{
				System.out.println("The number" +i+ "is Prime");
			}
				//else
				//	System.out.println("The given number" +i+ "is not a Prime");
			
		}
}}


