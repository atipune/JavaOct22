package com.java.LogicalPrograms;

public class SumAndAverageOfArrayElement 
{
	public static void main(String[] args) {
		int[] a= {2,4,7,9,5,1,3,5,7,5,6,1};
		int sum=0;
		float avg=0.0f;
		for(int i=0; i<a.length; i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		avg=(float)sum/a.length;
		System.out.println(avg);
	}
}
