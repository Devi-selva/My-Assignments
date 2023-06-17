package week3assignments;

import java.util.Arrays;


public class SortingUsingCollection {

	public static void main(String[] args) {

		String[] CompanyList= {"HCL", "Wipro",  "Aspire Systems", "CTS"};
		
		int len= CompanyList.length;
		Arrays.sort(CompanyList);
		
		String result="";
		for (int i=len-1;i>=0;i--)
		{
			if (i==0)
			{
				result=result+CompanyList[i];
			}
			else
			{
			result=result+CompanyList[i]+",";
			}
		}
		System.out.println(result);
	}	
}
