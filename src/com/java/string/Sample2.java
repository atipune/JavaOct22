package com.java.string;

public class Sample2 
{
	public static void main(String[] args) {
		String s1="Aspire";
		String s2="ASPIRE";
		String s3="Aspire Training Institute Pune";
		System.out.println(s3.charAt(s3.length()-1));
		System.out.println(s3.startsWith("Asp"));
		System.out.println(s3.startsWith(s1));
		System.out.println(s3.endsWith("Aspire Training Institute Pune"));
		System.out.println(s3.substring(2));
		System.out.println(s1.substring(2, 5)); //firstIndex-incluide, last index-excluide
		System.out.println(s3.substring(7,s3.length()));
		System.out.println(s3.indexOf('I'));
		System.out.println(s3.lastIndexOf('e'));
		String s=s1.concat(s2);
		System.out.println(s);
		System.out.println(s3.replace("e", "E"));
	}
	
}
