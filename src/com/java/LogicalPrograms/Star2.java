package com.java.LogicalPrograms;
//*****
//*****
//*****
//*****
//rows=4, star=5
public class Star2 {
	public static void main(String[] args) {
		int star=5;
		int rows=4;
//		for(int i=1; i<=rows; i++)
//		{
//			for(int j=1; j<=star; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		int i=1;
		while(i<=rows) {
			int j=1;
			while(j<=star)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;	
		}
	}
}
