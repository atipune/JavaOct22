package com.java.LogicalPrograms;
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, (55+34)
//1. print first 10 number in series
//2. print series numbers upto 100
public class FabonaciSeries 
{	
	public static void firstTenNumbers(int count)
	{
		int a=0;
		int b=1;		
		System.out.println(a);
		System.out.println(b);	
		for(int i=1; i<=count-2; i++)
		{
			int sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
		}
	}
	public static void printSeriesUptoANumber(int num)
	{
		int a=0;
		int b=1;		
		System.out.println(a);
		System.out.println(b);
//		if(sum<=num)
//		{
//			System.out.println(sum);
//		}
	}
	public static void main(String[] args) {
		int count=20;	
		firstTenNumbers(count);
		int num=100;
		printSeriesUptoANumber(num);
	}
}
