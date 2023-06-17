package week3assignments;

public class AxisBank extends BankInfo{
	
	public void deposit()
	{
	System.out.println("Mandatory for Deposit is 1000");
	}
	
	public static void main(String[] args) {
		
		AxisBank AX= new AxisBank();
		
		AX.deposit();
		
	}
}


