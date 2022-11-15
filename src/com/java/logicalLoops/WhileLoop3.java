package com.java.logicalLoops;
//print numbrs from 100 to 200 which are divisible by 3 and 7
//also count of numbers
public class WhileLoop3 {
	public static void main(String[] args) {
		int count=0;
		int i=100;
		while(i<=200)
		{
			if(i%3==0 && i%7==0)
			{
				System.out.println(i);
				count++;	//count=count+1
			}	
			i++;
		}
		System.out.println("Count of numbers divisible by 3 & 7 ="+count);
	}
}
