package com.java.LogicalPrograms;

public class DuplicateElementInArray {
	public static void main(String[] args) {
		int[] a= {1,2,6,5,4,9,93,1,5};
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}
}
