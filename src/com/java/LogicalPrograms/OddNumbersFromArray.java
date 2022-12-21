package com.java.LogicalPrograms;

public class OddNumbersFromArray {
	public static void main(String[] args) {
		int[] a= {1,2,6,8,4,6,9,8,1,2,64,5};
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}
	}
}
