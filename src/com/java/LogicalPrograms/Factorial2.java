package com.java.LogicalPrograms;

import java.util.Scanner;

public class Factorial2 
{
	public static int factorialMethod(int a)
	{
		int fact=1;
		for(int i=a; i>=1; i--)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();	
		int result = factorialMethod(num);
		System.out.println(result);
	}
}
