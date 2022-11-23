package com.java.LogicalPrograms;

import java.util.Scanner;

//6!=6x5x4x3x2x1=720
public class FactorialNumber 
{
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();	//0000-9999 -->10000
		int fact=1;
		for(int i=num; i>=1; i--)
		{
			fact=fact*i; //6*5, 30*4, 120*3, 360*2, 720*1, 720*
		}
		System.out.println(fact);
	}
}
