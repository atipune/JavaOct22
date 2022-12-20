package com.java.LogicalPrograms;
//without Using Arrays.sort method
public class SortArray2 
{
	public static void main(String[] args) 
	{
		int[] ar= {4,8,6,1,7,9,2,4};
		for(int i=0; i<ar.length; i++)
		{
			for(int j=i+1; j<ar.length; j++)
			{
				if(ar[i]>ar[j])
				{
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
				}
			}
		}
		for(int k=0; k<ar.length; k++)
		{
			System.out.print(ar[k]+", ");
		}
	}
}
