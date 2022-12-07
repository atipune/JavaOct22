package com.java.LogicalPrograms;

//1. given number check for prime
//2. prime numbers in a range (100-200)
//3. first 10 prime numbers

public class PrimeNumbers 
{
	public void isPrimeNumber(int num)
	{
		int flag=0;
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				flag++;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Given number is a prime");
		}
		else
		{
				System.out.println("Given number is not a prime");
		}
	}
	public void primeNumbersInRange(int min, int max)
	{
		for(int k=min; k<=max; k++)
		{
			int flag=0;
			for(int i=2; i<k; i++)
			{
				if(k%i==0)
				{
					flag++;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(k);
			}
		}
	}
	public void countFirstPrimeNumebrs(int count)
	{
		int flag=0;
		int num=3;
		for(int i=0; i<=count; i++)
		{
			for(int j=2; j<num; j++)
			{
				if(num%j==0)
				{
					flag++;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(num);
			}
		}
		}
	public static void main(String[] args) {
		int num=3;		//scanner
		int min=100;
		int max=200;
		int count=10;
		PrimeNumbers object= new PrimeNumbers();
//		object.isPrimeNumber(num);
//		object.primeNumbersInRange(min, max);
		object.countFirstPrimeNumebrs(count);
	}
}
