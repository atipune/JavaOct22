package com.java.LogicalPrograms;
//1-100
public class OddAndEven 
{
	public static void evenNum(int a, int b)
	{
		System.out.println("Even Numbers");
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
		System.out.println("Odd numbers");
		for(int i=a; i<=b; i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		int a=101; //--> scanner class--> object create--> call nextInt()
		int b=200;
		evenNum(a, b);
		OddNum(a, b);
	}
}
