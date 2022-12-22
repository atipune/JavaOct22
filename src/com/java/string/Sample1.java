package com.java.string;

public class Sample1 
{
	public static void main(String[] args) {
		String s1="Aspire";
		String s = s1.toUpperCase();
		System.out.println(s);
		System.out.println(s1.toLowerCase());
		System.out.println(s1.length());
		String s2="Aspire Training Instiute";
		System.out.println(s2.contains(s1));
		String s3="ASPIRE";
		System.out.println(s1.equalsIgnoreCase(s3));
	}
}
