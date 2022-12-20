package com.java.LogicalPrograms;
//Using Arrays.sort method
import java.util.Arrays;

public class SortArray 
{
	public static void main(String[] args) {
		int[] ar= {4,8,6,1,7,9,2,4};
		System.out.println("*******Forward printing*******");
		Arrays.sort(ar);
		for(int i=0; i<ar.length; i++)
		{
			System.out.print(ar[i]+", ");
		}
		System.out.println();
		System.out.println("*******Reverse printing*******");
		for(int j=ar.length-1; j>=0; j--)
		{
			System.out.print(ar[j]+", ");
		}
	}
}
