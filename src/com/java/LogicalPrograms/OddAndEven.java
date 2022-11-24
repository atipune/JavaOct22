package com.java.LogicalPrograms;
//1-100
public class OddAndEven 
{
	public static void evenNum(int a, int b)
	{
		System.out.println("Even Numbers are:");
		for(int i=a; i<=b; i++) 
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
	public static void OddNum(int a, int b)
	{
		System.out.println("Odd numbers are:");
		for(int i=a; i<=b; i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		int a=10; //--> scanner class--> object create--> call nextInt()
		int b=15;
		evenNum(a, b);
		OddNum(a, b);
	}
}

/*
 * 1. On user defined range (parameterized method) print all even numbers. 
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 15
Output : Even numbers are:
		 10
		 12
		 14	*/

