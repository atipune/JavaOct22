package com.java.LogicalPrograms;

public class SumOfNumInRange 
{
	public static int addition(int min, int max)
	{
		int sum=0;
		for(int i=min; i<=max; i++)
		{
			sum=sum+i; //0+1, 1+2, 3+3, 6+4, 10+5, 15
		}
		return sum;
	}
	public static void main(String[] args) {
		int a=1;
		int b=5;
		int result = addition(a,b);
		System.out.println(result);
	}
}
/*Return sum of all the numbers in user defined range.
Input : Range -> 1 to 5
output : sum is 15*/