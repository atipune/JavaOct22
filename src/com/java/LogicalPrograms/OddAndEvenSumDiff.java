package com.java.LogicalPrograms;

public class OddAndEvenSumDiff 
{
	public static int evenNum(int a, int b)
	{
		int evenSum=0;
		for(int i=a; i<=b; i++) 
		{
			if(i%2==0)
			{
				evenSum=evenSum+i;
			}
		}
		return evenSum;
	}
	public static int OddNum(int a, int b)
	{
		int oddSum=0;
		for(int i=a; i<=b; i++)
		{
			if(i%2!=0)
			{
				oddSum=oddSum+i;
			}
		}
		return oddSum;
	}
	public static void main(String[] args) {
		int a=3; //--> scanner class--> object create--> call nextInt()
		int b=9;
		int result = OddNum(a, b)-evenNum(a, b);
		System.out.println(result);
	}
}

/*
 * Find difference between sum of odd numbers and even numbers in a given range
Input : Range -> 3 to 9
output : 6
hint : (3+5+7+9) - (4+6+8) = 6
*/
