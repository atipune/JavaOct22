package com.java.logicalLoops;
//print even numbers from 1 to 100
public class WhileLoop2 {
	public static void main(String[] args) {
		int i=1;
		while(i<=100)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
}
