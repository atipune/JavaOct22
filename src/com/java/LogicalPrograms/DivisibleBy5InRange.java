package com.java.LogicalPrograms;

import java.util.Scanner;

public class DivisibleBy5InRange {
	public static void divisibleNum(int min, int max)
	{
		for(int i=min; i<=max; i++)
		{
			if(i%5==0)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
//		int min=10;
//		int max=30;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		divisibleNum(a, b);
	}
}
/*2. On user defined range print all numbers which are divisible by 5. 
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 30
Output : Divisible by 5, numbers are:
		 10
		 15
		 20
		 25
		 30*/