package week1.day2;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums= {2,5,7,7,5,9,2,3};
		
		
		for (int i=0; i<nums.length;i++)
			
		{
			int n1= nums[i];

			for (int j=i+1; j<nums.length;j++) {
			
				int n2= nums[j];
			{
				if (n1==n2)
					System.out.println(nums[i]);
			}
		}
		
	}

}}
