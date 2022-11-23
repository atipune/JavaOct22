package com.java.LogicalPrograms;
//12345
//1234
//123
//12
//1
//rows=5; num=5
public class Num3 {
	public static void main(String[] args) {
		int rows=5, num=5;
		for(int i=1; i<=rows; i++)
		{
			int temp=0;
			for(int j=num; j>=i; j--)
			{
				temp++;
				System.out.print(temp);
			}
			System.out.println();
		}
	}
}
