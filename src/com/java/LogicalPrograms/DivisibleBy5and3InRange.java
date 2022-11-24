package com.java.LogicalPrograms;

public class DivisibleBy5and3InRange 
{
	public static void divisibleNum(int min, int max)
	{
		for(int i=min; i<=max; i++)
		{
			if(i%5==0 || i%3 == 0)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		int a=5;
		int b=100;
		divisibleNum(a,b);
	}
}
/*3. On user defined range print all numbers which are divisible by 5 and divisible by 3
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 18
Output : Divisible by 5 & 3, numbers are:
		 15*/