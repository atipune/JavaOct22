package com.java.LogicalPrograms;
//*
//**
//***
//****
//*****
//rows=5, Max. star=5
public class Star3 {
	public static void main(String[] args) {
		int rows=5;
		int star=5;
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
