package com.java.LogicalPrograms;
//    *
//   * *
//  * * *
// * * * *
//* * * * *
//rows=5, star=5, space=4
public class Star5 {
	public static void main(String[] args) {
	int rows=5, star=5, space=4;
	for(int i=1; i<=rows; i++)
	{
		for(int j=space; j>=i; j--)
		{
			System.out.print(" ");
		}
		for(int k=1; k<=i; k++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	}
}
