package com.java.LogicalPrograms;
//1
//11
//111
//1111
//11111
//num=5; rows=5
public class Num1 {
	public static void main(String[] args) {
		int num=5, rows=5;
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(1);
			}
			System.out.println();
		}
	}
}
