package week1.day2;

public class FindInterSection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] Arr1= {7,9,2,5,6,1};
		int[] Arr2= {6,7,2,0,9};
		
		int lA1= Arr1.length;
		int lA2= Arr2.length;
		
		for (int i=0; i<lA1;i++)
			
		{ 
			int n1=Arr1[i];
					
					for (int j=0;j<lA2;j++)
					{
						int n2=Arr2[j];
						
						if(n1==n2) {
							System.out.println(Arr1[i]);
							
						}
					}
				
				
		}
		
	}

}
