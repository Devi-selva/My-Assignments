package week3assignments;

public class FindIntersection {

	public static void main(String[] args) {
		
		int[] Arr1= {3,2,11,4,6,7};
		int[] Arr2= {1,2,8,4,9,7};
		
		for(int i =0;i<Arr1.length;i++)
		{
			for (int j=0;j<Arr2.length;j++)
			{
				if(Arr1[i]==Arr2[i])
				
					System.out.println(Arr1[i]);
				break;
				
			}
		}
		

	}

}
