package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstNumber=0;
		int secondNumber=1;
		int sum=0;
		
		for (int i=1; i<=11;i++)
			
		{
			System.out.println(firstNumber);
			sum = firstNumber+secondNumber;
			firstNumber=secondNumber;
			secondNumber=sum;
		
		}
			

	}

}
