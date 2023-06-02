package week1.day2;

public class Maths {

	public int  add (int i, int j) {
		
		int k = i+j;
	 return k;
	 
	}
	
	public int subtract(int i, int j)
	{
		int k= i-j;
		 return k;
	}
	
	public int divide(int i, int j)
	{
		int k = i/j;
		return k;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Maths Calc= new Maths();
		int sum=Calc.add(10, 5);
		int sub=Calc.subtract(10,5);
		int div= Calc.divide(10, 5);
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(div);
		

	}

}
